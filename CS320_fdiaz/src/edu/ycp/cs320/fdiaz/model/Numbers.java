package edu.ycp.cs320.fdiaz.model;

public class Numbers {
	private Double first, second, third;
	
	public Numbers() {
	}
	
	
	public void setFirst(Double first) {
		this.first = first;
	}
	public void setSecond(Double second) {
		this.second = second;
	}
	public void setThird(Double third) {
		this.third = third;
	}
	
	
	public Double getFirst() {
		return first;
	}
	public Double getSecond() {
		return second;
	}
	public Double getThird() {
		return third;
	}
	
	
		
	public Double addNumbers() {
		return (first + second + third);
	}
	public Double MultiplyNumbers() {
		return (first * second * third);
	}
	

}