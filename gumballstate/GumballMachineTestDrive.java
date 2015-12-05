package com.j2.state.gumballstate;

public class GumballMachineTestDrive { 

	public static void main(String[] args){ 
		GumballMachine gumballMachine = new GumballMachine(10); 
		System.out.println(gumballMachine); 
		gumballMachine.insertQuarter(); 	 
		gumballMachine.turnCrank(); 
		gumballMachine.insertQuarterError(); 
		gumballMachine.turnCrank(); 
		System.out.println(gumballMachine); 
	} 
} 
