package com.j2.singleton.printerspooler;

public class CoolerPrinterSpooler extends PrinterSpooler {
   protected static PrinterSpooler uniqueInstance;
 private CoolerPrinterSpooler(){
  super();

 }

}