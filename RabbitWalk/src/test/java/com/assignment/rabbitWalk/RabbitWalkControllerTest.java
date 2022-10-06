package com.assignment.rabbitWalk;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.assignment.rabbitWalk.RabbitWalkController;

public class RabbitWalkControllerTest {
	
	
	public RabbitWalkController rabbtWalkController;
	
	@Before
	public void setUp() {
		rabbtWalkController= new RabbitWalkController();
		
	}
	
	@Test
	public void test_getDestinationPath() throws Exception {
		String destinationPath= rabbtWalkController.getDestinationPath();
		assertNotNull(destinationPath);
	}
	
	@Test
	public void test_findPath() {
		
	
	int playGround[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
	String actualPath = rabbtWalkController.findPath(playGround);
	Assert.assertEquals("DFDDFF", actualPath);
	}
	
	
	@Test
	public void test_findPath1() {
		int playGround1[][] = { { 1, 1, 0, 0 }, { 0, 1, 0, 0 }, { 0, 1, 1, 0 }, { 0, 1, 0, 1 } };
		String	actualPath = rabbtWalkController.findPath(playGround1);

		Assert.assertEquals("Rabbit will not be able to reach destination as the path is blocked.", actualPath);
	}
	
	@Test 
	public void test_findPath2() {
		int playGround2[][] = { { 1, 0, 0, 0 }, { 0, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
		String actualPath = rabbtWalkController.findPath(playGround2);

		Assert.assertEquals("Rabbit will not be able to reach destination as the path is blocked.", actualPath);
	}
	
	@Test
	public void test_findPath3() {
	int playGround3[][] = { { 1, 2, 0, 0 }, { 0, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
	 String actualPath = rabbtWalkController.findPath(playGround3);

	Assert.assertEquals("Invalid cell present in the playGround, could not determine the path.", actualPath);
	}

	@Test 
	public void test_findPath4() {
		int playGround4[][] = { { 1, 0, 0, 0 }, { 0, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 0 } };
		String actualPath = rabbtWalkController.findPath(playGround4);

		Assert.assertEquals("Rabbit will not be able to reach destination as the path is blocked.", actualPath);
	}
	
	@Test 
	public void test_findPath5() {
		int playGround5[][] = { { 0, 0, 0, 0 }, { 0, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
		String actualPath = rabbtWalkController.findPath(playGround5);

		Assert.assertEquals("Rabbit will not be able to reach destination as the path is blocked.", actualPath);
	}
	

}
