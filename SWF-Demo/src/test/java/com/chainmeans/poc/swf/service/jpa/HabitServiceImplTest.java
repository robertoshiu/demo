/**
 * Created on April 13, 2013
 */
package com.chainmeans.poc.swf.service.jpa;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.chainmeans.poc.swf.domain.Habit;
import com.chainmeans.poc.swf.service.HabitService;

/**
 * @author Roberto
 * 
 */
public class HabitServiceImplTest {

	private GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
	
	@BeforeTest
	public void setup() {
		ctx.load("classpath:jpa-app-context.xml");
		ctx.refresh();
		System.out.println("App context initialized successfully");
	}

	@Test
	public void findAll() {
		HabitService habitService = ctx.getBean("habitService",
				HabitService.class);

		Assert.assertNotNull(habitService);

		List<Habit> habits = habitService.findAll();

		Assert.assertNotNull(habits);
		assert !habits.isEmpty();

		for (Habit hobby : habits) {
			System.out.println(hobby.getHabitId());
		}

		assert habits.size() == 6;
	}
}
