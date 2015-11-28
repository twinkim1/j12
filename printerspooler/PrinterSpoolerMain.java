package com.j2.singleton.printerspooler;

public class PrinterSpoolerMain {
 public static void main(String args[]){
  PrinterSpooler s1=CoolerPrinterSpooler.getInstance();
  System.out.println("Cooler");
  s1.save();
  s1.print();
  s1.drain();
 
  
  PrinterSpooler s2=HotterPrinterSpooler.getInstance();
  System.out.println("Hotter");
  s2.save();
  s2.print();
  s2.drain();
  
    }
  }