package com.j2.facade.smarthome;

public class SmartHomeTestDriver {
    public static void main(String[] args) {

    	Light light =new Light("My room light");
    	
    	Computer computer = new Computer("My Computer power");
    	
    	Mp3Player mp3player =new Mp3Player("My mp3");
    	 
 
        SmartHome smarthome = new SmartHome(light, computer,mp3player);
       
        smarthome.beginStudy("My Movie Watching...");
        smarthome.endStudy();
    }
}
