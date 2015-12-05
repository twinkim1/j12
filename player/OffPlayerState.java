package com.j2.state.player;

public class OffPlayerState implements State{
	Player player; 
	  public OffPlayerState (Player player){ 
	    this.player = player; 
	  } 
	  public void playPlayer(){ 
	    System.out.println("you can't play ,,Player turn on"); 

	  } 

	  public void stopPlayer(){ 
	    System.out.println("\t You can't stop ,,Player turn on "); 
	   player.setState(player.getStopState()); 

	  } 
	  public void onPlayer(){ 
	    System.out.println("\tOn Player"); 
	    player.setState(player.getPlayerOnState()); 
	  } 
	  public void offPlayer(){ 
	    System.out.println("\tAlready Player Off "); 
	  } 
	    public String toString(){ 
	    return " \tOff State ";} 

	} 


	 
