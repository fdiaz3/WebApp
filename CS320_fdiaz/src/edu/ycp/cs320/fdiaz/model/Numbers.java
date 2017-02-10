package edu.ycp.cs320.fdiaz.model;

public class Numbers {
	private Double first, second, third;
	
	public Numbers(Double first, Double second, Double third) {
			this.first = first;
			this.second = second;
			this.third = third;
		
	}
	public Double getFirst(){
		return first;
	}
	public Double getSecond(){
		return second;
	}
	public Double getThird(){
		return third;
	}
		
	public Double addNumbers() {
		return (first + second + third);
	}
	public Double MultiplyNumbers() {
		return (first * second * third);
	}
	

}