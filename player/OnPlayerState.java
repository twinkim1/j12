package com.j2.state.player;

public class OnPlayerState implements State{ 
	  Player player; 
	  public OnPlayerState(Player player){ 
	    this.player = player; 
	  } 
	  public void stopPlayer(){ 
	    System.out.println("\tAlready stop"); 

	  } 
	  public void playPlayer(){ 
	    System.out.println("\tPlay"); 
	    player.setState(player.getPlayState()); 
	  } 
	  public void onPlayer(){ 

	    System.out.println("\tAlready Player On"); 
	  } 
	  public void offPlayer(){ 
	    System.out.println("\tPlayer Off.."); 
	    player.setState(player.getPlayerOffState()); 
	  } 
	  public String toString(){ 
	   return " On State ";} 
	} 

	                 
