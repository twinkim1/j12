package com.j2.state.gumballstate;


public class ErrorState implements State{ 
	
	GumballMachine gm;
	
	public ErrorState(GumballMachine gm){ 
		this.gm = gm; 
	} 
	public void insertQuarter(){ 
		System.out.println("You can't insert quarter"); 
	} 
	public void ejectQuarter(){ 
		System.out.println("You can't eject"); 
	} 

	public void turnCrank(){

		System.out.println("You can.t turned"); 
	}  
	public void dispense(){ 
		System.out.println("you can't dispense"); 
	} 
	public String toString(){ 
		return "Error Machine"; 
	} 
}

 






