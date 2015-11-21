package com.j2.command.party;

public class RemoteLoader { 
	
 public static void main(String[] args) {  
 
	 RemoteControl remoteControl = new RemoteControl();
     Light light = new Light("Living Room");  
     Dvd dvd = new Dvd("Living Room");  
     Boiler boiler = new Boiler("living Room");
     LightOnCommand lightOn = new LightOnCommand(light);  
     DvdOnCommand dvdOn = new DvdOnCommand(dvd); 
     BoilerOnCommand boilerOn = new BoilerOnCommand(boiler);
     LightOffCommand lightOff = new LightOffCommand(light);  
     DvdOffCommand dvdOff = new DvdOffCommand(dvd);  
     BoilerOffCommand boilerOff= new BoilerOffCommand(boiler);
     
     Command[] partyOn = { lightOn, dvdOn,boilerOn}; 
     Command[] partyOff = { lightOff, dvdOff,boilerOff};  
    
     MacroCommand partyOnMacro = new MacroCommand(partyOn);  
     MacroCommand partyOffMacro = new MacroCommand(partyOff);  
     
     remoteControl.setCommand(0, partyOnMacro, partyOffMacro);  
     
     System.out.println(remoteControl);  
     System.out.println("--- pushing Macro On---");  
     remoteControl.onButtonWasPushed(0);  
     System.out.println("--- Pushing Macro Off---");
     remoteControl.offButtonWasPushed(0);  
 }  

}  
