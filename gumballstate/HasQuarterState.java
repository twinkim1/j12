package com.j2.state.gumballstate;
 

public class HasQuarterState implements State{  
	GumballMachine gumballMachine;
	HasQuarterState(GumballMachine gm){ 
		this.gumballMachine = gm; 
	} 

	public void insertQuarter(){ 
		System.out.println("You can't insert another quarter"); 
	} 
	public void ejectQuarter(){ 
		System.out.println("Quarter returned"); 
		gumballMachine.setState(gumballMachine.getNoQuarterState()); 

	} 

	public void turnCrank(){ 
		System.out.println("You turned.."); 
		gumballMachine.setState(gumballMachine.getSoldState());
	}
	public void dispense(){ 
		System.out.println("No gumball dispensed"); 
	} 
	public String toString(){ 
		return "waiting for turn of crank"; 
	} 
} 

