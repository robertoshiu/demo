/**
 * Created on April 12, 2013
 */
package com.chainmeans.poc.swf.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.chainmeans.poc.swf.domain.Nexus;

/**
 * @author Roberto
 *
 */
public interface NexusRepository extends CrudRepository<Nexus, Long> {

	@Query("select n from Nexus n left join fetch n.habits h where n.id = :id")
	public Nexus findByIdWithDetail(@Param("id") Long id);
	
}
