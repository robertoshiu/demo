/**
 * Created on April 13, 2013
 */
package com.chainmeans.poc.swf.web.view;

import java.io.Serializable;

import org.primefaces.model.DualListModel;

import com.chainmeans.poc.swf.domain.Nexus;
import com.chainmeans.poc.swf.domain.Habit;

/**
 * @author Roberto
 *
 */
public class NexusBean implements Serializable {
	
	private Nexus nexus;
	
	private DualListModel<Habit> habits;

	public Nexus getNexus() {
		return nexus;
	}

	public void setNexus(Nexus nexus) {
		this.nexus = nexus;
	}

	public DualListModel<Habit> getHabits() {
		return habits;
	}

	public void setHabits(DualListModel<Habit> habits) {
		this.habits = habits;
	}		
	
}
