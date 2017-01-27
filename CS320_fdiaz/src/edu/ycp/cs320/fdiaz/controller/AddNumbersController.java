package edu.ycp.cs320.fdiaz.controller;
import edu.ycp.cs320.fdiaz.model.Numbers;

public class AddNumbersController {
	private Numbers model;
	
	public void setModel(Numbers model, Double first, Double second, Double third) {
		model.setFirst(first);
		model.setSecond(second);
		model.setThird(third);
		this.model = model;
		
	}
	
	public Double add(){
		return model.addNumbers();
	}

}
