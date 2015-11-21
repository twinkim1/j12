package com.j2.command.party;

public class BoilerOnCommand implements Command {

	 
	Boiler boiler; 
		 int level; 
		 public BoilerOnCommand(Boiler boiler) { 
		   this.boiler=boiler; 
		 } 
		 public void execute() { 
		   level = boiler.getLevel(); 
		   boiler.on(); 
		 } 
		 public void undo() { 
			 boiler.boil(level); 
		 } 
		} 