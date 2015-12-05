package com.j2.state.player;

public class TestDrive {

  public static void main(String args[]){ 
    Player player = new Player(); 
    
    System.out.println(player);  
    player.onPlayer();
    
    
    System.out.println(player); 

    player.playPlayer();
  
    System.out.println(player);   
    player.offPlayer();
    player.stopPlayer();
    player.offPlayer();
    System.out.println(player);   
     }
} 
 







