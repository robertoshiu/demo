/**
 * Created on April 12, 2013
 */
package com.chainmeans.poc.swf.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainmeans.poc.swf.domain.Habit;
import com.chainmeans.poc.swf.repository.HabitRepository;
import com.chainmeans.poc.swf.service.HabitService;
import com.google.common.collect.Lists;

/**
 * @author Roberto
 *
 */
@Service("habitService")
@Repository
@Transactional
public class HabitServiceImpl implements HabitService {

	@Autowired
	private HabitRepository habitRepository;

	@Transactional(readOnly=true)
	public List<Habit> findAll() {
		return Lists.newArrayList(habitRepository.findAll());
	}

}
