package com.assignment.rabbitWalk;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
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
	
	@Test
	public void test_findPath() {
	int playGround[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
	String actualPath = homeController.findPath(playGround);

	Assert.assertEquals("DFDDFF", actualPath);

	int playGround1[][] = { { 1, 0, 0, 0 }, { 0, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
	actualPath = homeController.findPath(playGround1);

	Assert.assertEquals("DFFF", actualPath);
	
	int playGround2[][] = { { 1, 2, 0, 0 }, { 0, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
	actualPath = homeController.findPath(playGround2);

	Assert.assertEquals("Invalid cell", actualPath);
	}
	
	

}
