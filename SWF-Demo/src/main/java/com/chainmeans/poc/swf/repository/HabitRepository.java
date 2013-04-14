/**
 * Created on April 12, 2013
 */
package com.chainmeans.poc.swf.repository;

import org.springframework.data.repository.CrudRepository;

import com.chainmeans.poc.swf.domain.Habit;

/**
 * @author Roberto
 *
 */
public interface HabitRepository extends CrudRepository<Habit, String> {

}
