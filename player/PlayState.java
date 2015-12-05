package com.j2.state.player;

public class PlayState implements State{ 
	  Player player; 
	  public PlayState(Player player){ 
	    this.player = player; 
	  } 
	  public void stopPlayer(){ 
	    System.out.println("\tStop Playing"); 
	    player.setState(player.getStopState());
	  } 
	  public void playPlayer(){ 
	    System.out.println("\tAlready play"); 
	  } 
	  
	  public void onPlayer(){ 
	    System.out.println("\talready Player on"); 
	  } 
	  public void offPlayer(){ 
	    System.out.println("\tYou can't off,,,stop play"); 
	  } 
	    public String toString(){ 
	    return " Play State ";} 
	} 
