package com.j2.templatemethod.barista;

public class Caramel extends CondimentDecorator{
	Beverage beverage;
	
public Caramel(Beverage beverage) { 
	this.beverage = beverage; 
}
	public String getDescription() { 
		  return beverage.getDescription() + ", Caramel"; 
		 } 


}
