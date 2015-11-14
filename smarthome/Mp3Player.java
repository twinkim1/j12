package com.j2.facade.smarthome;

public class Mp3Player {

	  private String description; 
	  
	  private int level; 

	  public Mp3Player(String description){
	    this.description = description; 
	  } 
	  public void on(){ 
	    System.out.println(description+ " on"); 
	  } 
	  public void off(){ 
	    System.out.println(description+ " off"); 
	  } 
	  
	  public void vol(int level){ 
	    System.out.println(description+ "volume to "+ level); 

	    this.level = level; 
	  } 
	} 

