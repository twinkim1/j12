package com.j2.state.player;

public class StopState implements State{ 
	  Player player; 
	  public StopState(Player player){ 
	    this.player = player; 
	  } 
	  public void stopPlayer(){ 
	    System.out.println("\talready Player Stop "); 
	  } 
	  public void playPlayer(){ 
	    System.out.println("Play"); 
	    player.setState(player.getPlayState()); 
	  } 
	  public void onPlayer(){
	    System.out.println("\talready Player On "); 
	  } 
	  public void offPlayer(){ 
	    System.out.println("\toff Player"); 
	    player.setState(player.getPlayerOffState()); 
	  } 
	    public String toString(){ 

	    return " Stop State ";} 

	} 


	             
