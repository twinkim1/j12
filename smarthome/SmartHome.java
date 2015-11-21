package com.j2.facade.smarthome;

public class SmartHome {
	private Light light;
	private	Computer computer;
	private Mp3Player mp3player;
 
    public SmartHome (Light light, Computer computer, Mp3Player mp3player) {
    	this.light = light;
    	this.computer= computer;
    	this.mp3player =  mp3player;
    }
    public void beginStudy(String movie) {
        System.out.println("beginStudy...");
        
        light.on();
        light.dim(80);
        computer.on();
        mp3player.on();
        mp3player.vol(5);
    }
    public void endStudy() {
        System.out.println("endStudy...");
        light.off();
        computer.off();
        mp3player.off();
    }


}
