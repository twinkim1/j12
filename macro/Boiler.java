package com.j2.command.party;

public class Boiler {

		int level; 
	  String location; 
	  public Boiler(String location) { 
	    this.location = location; 
	  } 
	  public int getLevel() {
		  return level;
		  }
	 public void on() { 
		 level = 100; 
		 System.out.println("Boiler is on"); 
	  } 
	public void off() { 
		level = 0; 
	    System.out.println("Boiler is off"); 
	  } 
	  public void boil(int level) { 
	    this.level = level; 
	    if(level==0) { 
		off();
	    } 
	 else { 
		 System.out.println("Boiler is on "+level); 
		 } 
	  } 
		 
	  } 

