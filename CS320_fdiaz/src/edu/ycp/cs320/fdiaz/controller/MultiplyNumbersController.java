package edu.ycp.cs320.fdiaz.controller;
import edu.ycp.cs320.fdiaz.model.Numbers;

public class MultiplyNumbersController {
	private Numbers model;
	
	public void setModel(Numbers model, Double first, Double second, Double third) {
		model.setFirst(first);
		model.setSecond(second);
		model.setThird(third);
		this.model = model;
		
	}
	
	public Double multiply(){
		return model.MultiplyNumbers();
	}
}