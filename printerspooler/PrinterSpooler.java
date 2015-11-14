package com.j2.singleton.printerspooler;

public class PrinterSpooler {
 

 private boolean empty;
 private boolean printed;
 protected static PrinterSpooler uniqueInstance;
 protected PrinterSpooler() { 
   empty = true;
    printed = false;
  }
 public static synchronized PrinterSpooler getInstance() {
  if (uniqueInstance == null) {
    System.out.println("Creating unique instance of PrinterSpooler");
   uniqueInstance = new PrinterSpooler();
  }
    System.out.println("Returning instance of PrinterSpooler");
  return uniqueInstance;
 }
 public void save() {
    if (isEmpty()) {
      System.out.println("Save document");
      empty = false;
      printed = false;
    }
  }

  public void drain() {  
    if (!isEmpty() && isPrinted()) {  
      System.out.println("Drain document");
      empty = true; 
    } 
  }

  public void print() { 
    if (!isEmpty() && !isPrinted()) {
      System.out.println("Print document");
      printed = true;
    } 
  }
   
  public boolean isEmpty() { 
    return empty;
  }

  public boolean isPrinted() {
    return printed;  
  }

  }