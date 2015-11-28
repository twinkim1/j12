package com.j2.templatemethod.barista;

public class CaramelMacchiato extends CoffeeWithHook{
	Beverage beverage;
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	public void addCondiments(){ 
	beverage = new Espresso(); 
	beverage = new Milk(beverage); 
	beverage = new VanillaSyrup(beverage); 
    beverage = new Caramel(beverage); 
    
    System.out.println("Adding "+beverage.getDescription());

	}
}
