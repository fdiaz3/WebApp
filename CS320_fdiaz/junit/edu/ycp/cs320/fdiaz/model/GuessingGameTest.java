package edu.ycp.cs320.fdiaz.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.fdiaz.model.GuessingGame;

public class GuessingGameTest {
	private GuessingGame model;
	
	@Before
	public void setUp() {
		model = new GuessingGame();
	}
	
	@Test
	public void testSetMin() {
		model.setMin(1);
		assertEquals(1, model.getMin());
	}
	
	@Test
	public void testSetMax() {
		model.setMax(100);
		assertEquals(100, model.getMax());
	}
	
	@Test
	public void testIsDone() {
		model.setMax(50);
		model.setMin(50);
		assertTrue(model.isDone());
	}
}
