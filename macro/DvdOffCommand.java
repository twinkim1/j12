package com.j2.command.party;

public class DvdOffCommand implements Command { 
 Dvd dvd; 
 int level; 
 public DvdOffCommand(Dvd dvd) { 
   this.dvd=dvd; 
 } 
 public void execute() { 
   level = dvd.getLevel(); 
   dvd.off(); 
 } 
 public void undo() { 
   dvd.dv(level); 
 } 
} 