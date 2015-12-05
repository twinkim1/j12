package com.j2.command.party;

public class DvdOnCommand implements Command { 
 Dvd dvd; 
 int level; 
 public DvdOnCommand(Dvd dvd) { 
   this.dvd=dvd; 
 } 
 public void execute() { 
   level = dvd.getLevel(); 
   dvd.on(); 
 } 
 public void undo() { 
   dvd.dv(level); 
 } 
} 