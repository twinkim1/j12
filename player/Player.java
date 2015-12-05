package com.j2.state.player;

public class Player{ 
	State offPlayerState; 
	  State onPlayerState; 
	  State playState; 
	  State stopState; 
	  State state = offPlayerState; 

	  public Player(){ 
	    offPlayerState = new OffPlayerState(this); 
	    onPlayerState = new OnPlayerState(this); 
	    playState = new PlayState(this); 
	    stopState = new StopState(this); 
	    state = offPlayerState;
	  } 
	  public void playPlayer(){ 
	    state.playPlayer(); 
	  } 
	  public void stopPlayer(){ 
	    state.stopPlayer();} 
	  public void onPlayer(){ 
	    state.onPlayer();} 
	  public void offPlayer(){ 
	    state.offPlayer(); 

	  } 
	  void setState(State state){ 
	    this.state = state; 
	  } 
	  public State getPlayerOnState(){ 
	    return onPlayerState; 
	  } 
	  public State getPlayState(){ 
	    return playState; 
	  } 

	  public State getStopState(){ 
	    return stopState;} 
	  public State getPlayerOffState(){ 
	    return offPlayerState; 
	  } 
	  public String toString(){ 
		  StringBuffer result = new StringBuffer();  
		  result.append("\n\t--Player " + state + "--\n");
		  return result.toString();
	} 
}