package edu.ycp.cs320.fdiaz.controller;
import edu.ycp.cs320.fdiaz.model.Numbers;

public class MultiplyNumbersController {
	private Numbers model;
	
	public void setModel(Numbers model) {
		this.model = model;
		
	}
	
	public Double multiply(){
		return model.MultiplyNumbers();
	}
}