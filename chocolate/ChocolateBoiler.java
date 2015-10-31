package com.j2.singleton.chocolate.threadsafe;

 public class ChocolateBoiler {
 private boolean empty;
 private boolean boiled;
 private static ChocolateBoiler uniqueInstance;
  
 private ChocolateBoiler() {
  empty = true;
  boiled = false;
 }
  
 public static synchronized ChocolateBoiler getInstance() {
  if (uniqueInstance == null) {
   System.out.println("Creating unique instance of Chocolate Boiler");
   uniqueInstance = new ChocolateBoiler();
  }
  System.out.println("Returning instance of Chocolate Boiler");
  return uniqueInstance;
 }

 public void fill() {
  if (isEmpty()) {
   System.out.println("우유와 초콜릿을 보일러에 투입");
   empty = false;
   boiled = false;
   // fill the boiler with a milk/chocolate mixture
  }
 }
 
 public void drain() {
  if (!isEmpty() && isBoiled()) {
   System.out.println("끓인 재료를 추출");
   // drain the boiled milk and chocolate
   empty = true;
  }
 }
 
 public void boil() {
  if (!isEmpty() && !isBoiled()) {
   // bring the contents to a boil
   System.out.println("재룔를 끓임");
   boiled = true;
  }
 }
  
 public boolean isEmpty() {
  return empty;
 }
 
 public boolean isBoiled() {
  return boiled;
 }
}
