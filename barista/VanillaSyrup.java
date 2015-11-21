package com.j2.templatemethod.barista;

public class VanillaSyrup extends CondimentDecorator { 
	Beverage beverage; 
public VanillaSyrup(Beverage beverage) { 
	this.beverage = beverage; 
} 
public String getDescription() { 
	return beverage.getDescription() + ", Vanilla Syrup"; 
} 

} 
