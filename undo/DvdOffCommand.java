package com.j2.command.undo;


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