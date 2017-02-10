package edu.ycp.cs320.fdiaz.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.fdiaz.controller.AddNumbersController;
import edu.ycp.cs320.fdiaz.controller.MultiplyNumbersController;

import edu.ycp.cs320.fdiaz.model.Numbers;


public class AddMultiplyTest{
	private Numbers model;
	private AddNumbersController addCont;
	private MultiplyNumbersController multCont;
	
	@Before
	public void setup(){
		model = new Numbers(13.0, 14.0, 15.0);
		addCont = new AddNumbersController();
		multCont = new MultiplyNumbersController();
		
		addCont.setModel(model);
		multCont.setModel(model);
		
	}
	
	@Test
	public void testInitializeNumbers(){
		Double first = 13.0;
		Double second = 14.0;
		Double third = 15.0;
		
		assertEquals(first, model.getFirst());
		assertEquals(second, model.getSecond());
		assertEquals(third, model.getThird());

	}
	public void testMath(){
		
		assertEquals(addCont.add(), (Double)42.0);
		assertEquals(multCont.multiply(), (Double)2730.0);
	}
	
}