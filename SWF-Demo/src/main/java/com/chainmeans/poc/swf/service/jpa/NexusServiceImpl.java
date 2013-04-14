/**
 * Created on April 12, 2013
 */
package com.chainmeans.poc.swf.service.jpa;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainmeans.poc.swf.domain.Nexus;
import com.chainmeans.poc.swf.repository.NexusRepository;
import com.chainmeans.poc.swf.service.NexusService;
import com.google.common.collect.Lists;

/**
 * @author Roberto
 *
 */
@Service("nexusService")
@Repository
@Transactional
public class NexusServiceImpl implements NexusService {

	final static Logger logger = LoggerFactory.getLogger(NexusServiceImpl.class);
	
	@Autowired
	private NexusRepository nexusRepository;
	
	@Transactional(readOnly=true)
	public List<Nexus> findAll() {
		logger.info("Finding all nexus");
		return Lists.newArrayList(nexusRepository.findAll());
	}

	@Transactional(readOnly=true)
	public Nexus findById(Long id) {
		return nexusRepository.findOne(id);
	}

	@Transactional(readOnly=true)
	public Nexus findByIdWithDetail(Long id) {
		return nexusRepository.findByIdWithDetail(id);
	}

	public Nexus save(Nexus nexus) {
		return nexusRepository.save(nexus);
	}

}
