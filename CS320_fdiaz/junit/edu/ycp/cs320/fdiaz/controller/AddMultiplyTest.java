package edu.ycp.cs320.fdiaz.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
		model = new Numbers();
		addCont = new AddNumbersController();
		multCont = new MultiplyNumbersController();
		
		
		
	}
}