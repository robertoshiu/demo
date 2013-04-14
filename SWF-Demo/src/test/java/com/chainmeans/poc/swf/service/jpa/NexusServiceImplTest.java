package com.chainmeans.poc.swf.service.jpa;

import java.util.HashSet;
import java.util.List;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import com.chainmeans.poc.swf.domain.Nexus;
import com.chainmeans.poc.swf.service.NexusService;

public class NexusServiceImplTest {
	private GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
	private NexusService nexusService;
	
	@Mock
	private NexusService mockService;
	
	@BeforeTest
	public void setup() {
		ctx.load("classpath:jpa-app-context.xml");
		ctx.refresh();
		System.out.println("App context initialized successfully");
		nexusService = ctx.getBean("nexusService", NexusService.class);
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void findAll() {
		Assert.assertNotNull(nexusService);

		List<Nexus> nexuses = nexusService.findAll();

		Assert.assertNotNull(nexuses);
		assert !nexuses.isEmpty();

		for (Nexus nexus : nexuses) {
			System.out.println(nexus);
		}

		assert nexuses.size() == 13;
	}

	@Test
	public void findById() {
		Nexus nexus = nexusService.findById(Long.valueOf("1"));
		System.out.println(nexus);
		Assert.assertNotNull(nexus);
		Assert.assertEquals(nexus.getFirstName(), "Roberto");
	}

	@Test
	public void findByIdWithDetail() {
		Nexus nexus = nexusService.findByIdWithDetail(Long.valueOf("1"));
		System.out.println(nexus);
		Assert.assertNotNull(nexus);
		Assert.assertEquals(nexus.getFirstName(), "Roberto");
		Assert.assertEquals(nexus.getHabits().size(), 2);
	}

	@Test
	public void save() {
		Nexus nexus = mock(Nexus.class);
		when(nexus.getFirstName()).thenReturn("Jeremy");
		nexus.setHabits(any(HashSet.class));
		Assert.assertEquals(nexus.getFirstName(), "Jeremy");
		Assert.assertNull(mockService.save(nexus));
		verify(mockService).save(nexus);
	}
}
