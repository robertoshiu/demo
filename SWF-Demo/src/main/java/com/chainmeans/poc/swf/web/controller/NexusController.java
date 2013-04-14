/**
 * Created on April 13, 2013
 */
package com.chainmeans.poc.swf.web.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.primefaces.model.DualListModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.webflow.execution.RequestContext;

import com.chainmeans.poc.swf.domain.Nexus;
import com.chainmeans.poc.swf.domain.Habit;
import com.chainmeans.poc.swf.service.NexusService;
import com.chainmeans.poc.swf.service.HabitService;
import com.chainmeans.poc.swf.web.view.NexusBean;
import com.chainmeans.poc.swf.web.view.NexusListBean;

/**
 * @author Roberto
 *
 */
@Component("nexusController")
public class NexusController {

	private static final Logger logger = LoggerFactory.getLogger(NexusController.class);

	@Autowired
	private NexusService nexusService;
	
	@Autowired
	private HabitService habitService;	
	
	public NexusListBean newNexusListBean() {
		
		NexusListBean nexusListBean = new NexusListBean();
		
		nexusListBean.setNexus(nexusService.findAll());
		
		return nexusListBean;
		
	}
	
	public Nexus showNexus(RequestContext context) {
		
		Long id = context.getRequestScope().getLong("nexusId");
		
		logger.info("Selected nexus id: {}", id);
		
		return nexusService.findByIdWithDetail(id);
		
	}
	
	public NexusBean newNexusBean() {
		
		logger.info("Creating new nexus bean");
		NexusBean nexusBean = new NexusBean();
		
		Nexus nexus = new Nexus();
		nexusBean.setNexus(nexus);
		
        List<Habit> habitsSource = new ArrayList<Habit>();
        List<Habit> habitsTarget = new ArrayList<Habit>();
       
        for (Habit habit: habitService.findAll()) {
        	habitsSource.add(habit);
        }
		
        DualListModel<Habit> habits = new DualListModel<Habit>(habitsSource, habitsTarget);  
        
        nexusBean.setHabits(habits);
		
		return nexusBean;
		
	}
	
	public void saveNexus(RequestContext context) {
		
		// Retrieve nexus bean
		NexusBean nexusBean = (NexusBean) context.getFlowScope().get("nexusBean");
		Nexus nexus = nexusBean.getNexus();
		
		Set<Habit> habits = new HashSet<Habit>(nexusBean.getHabits().getTarget());
		
		nexus.setHabits(habits);
		
		nexusService.save(nexus);
		
		logger.info("Nexus {} {} saved successfully", nexus.getFirstName(), nexus.getLastName());
		
		context.getMessageContext().addMessage(new MessageBuilder().info().code("message_nexus_save_success").build());
		
	}	
	
}
