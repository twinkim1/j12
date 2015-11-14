package com.j2.facade.smarthome;

public class Computer {

String description; 

public Computer(String description) { 
 this.description = description; 
}

public void on() { 
 System.out.println(description + " on"); 
} 
public void off() {
	System.out.println(description + " off"); 
}

public String toString() {
	return description; 
   }
} 

