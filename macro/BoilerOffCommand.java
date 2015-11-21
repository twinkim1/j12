package com.j2.command.party;

public class BoilerOffCommand implements Command {

	 
	Boiler boiler; 
		 int level; 
		 public BoilerOffCommand(Boiler boiler) { 
		   this.boiler=boiler; 
		 } 
		 public void execute() { 
		   level = boiler.getLevel(); 
		   boiler.off(); 
		 } 
		 public void undo() { 
			 boiler.boil(level); 
		 } 
		} 