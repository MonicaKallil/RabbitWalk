package com.assignment.rabbitWalk;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.assignment.rabbitWalk.RabbitWalkController;

public class RabbitWalkControllerTest {
	
	
	public RabbitWalkController homeController;
	
	@Before
	public void setUp() {
		homeController= new RabbitWalkController();
		
	}
	
	@Test
	public void test_getDestinationPath() throws Exception {
		String destinationPath= homeController.getDestinationPath();
		assertNotNull(destinationPath);
	}
	

}
