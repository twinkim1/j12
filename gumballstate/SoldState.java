package com.j2.state.gumballstate;

public class SoldState implements State{ 

	GumballMachine gumballMachine; 
	public SoldState(GumballMachine gm){ 
		this.gumballMachine = gm; 
	} 
	public void insertQuarter(){ 
		System.out.println("Please wait, we're already giving you a gumball"); 
	} 
	public void ejectQuarter(){ 
		System.out.println("Sorry, you already turned th crank"); 
	} 
	public void turnCrank(){ 
		System.out.println("Turning twice doesn't get you another gumball!"); 
	}  
	public void dispense(){ 
		gumballMachine.releaseBall(); 
		if(gumballMachine.getCount()>0){ 
			gumballMachine.setState(gumballMachine.getNoQuarterState()); 

		}else{ 
			System.out.println("Oops, out of gumballs!"); 
			gumballMachine.setState(gumballMachine.getSoldOutState()); 

		} 
	} 
	public String toString(){ 
		return "dispensing a gumball"; 
	} 
} 
