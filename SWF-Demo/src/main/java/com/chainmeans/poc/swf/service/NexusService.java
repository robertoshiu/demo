/**
 * Created on April 11, 2013
 */
package com.chainmeans.poc.swf.service;

import java.util.List;

import com.chainmeans.poc.swf.domain.Nexus;

/**
 * @author Roberto
 *
 */
public interface NexusService {

	public List<Nexus> findAll();
	
	public Nexus findById(Long id);
	
	public Nexus findByIdWithDetail(Long id);
	
	public Nexus save(Nexus nexus);	
	
}
