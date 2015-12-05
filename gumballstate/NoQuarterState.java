package com.j2.state.gumballstate;

public class NoQuarterState implements State{ 
		GumballMachine gumballMachine; 
		public NoQuarterState(GumballMachine gm){ 
			this.gumballMachine = gm; 
		} 
		public void insertQuarter(){
			System.out.println("You inserted a quarter"); 
			gumballMachine.setState(gumballMachine.getHasQuarterState()); 
		} 
		public void ejectQuarter(){ 
			System.out.println("You haven't inserted a quarter.."); 
		} 
		public void turnCrank(){ 

			System.out.println("You turned, but no quarter"); 
		}  
		public void dispense(){ 
			System.out.println("pay first"); 
		} 
		public String toString(){ 
			return "waiting for quarter"; 
		} 
} 
