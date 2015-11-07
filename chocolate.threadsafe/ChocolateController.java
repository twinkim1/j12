package com.j2.singleton.chocolate.threadsafe;

 public class ChocolateController {
 public static void main(String args[]) {
  ChocolateBoiler boiler = ChocolateBoiler.getInstance();
  System.out.println("1");
  boiler.fill();
  boiler.boil();
  boiler.drain();

  ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    System.out.println("2");
   boiler2.fill();
  boiler2.boil();
  boiler2.drain();

 }
}
