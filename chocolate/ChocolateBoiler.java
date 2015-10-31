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
   System.out.println("������ ���ݸ��� ���Ϸ��� ����");
   empty = false;
   boiled = false;
   // fill the boiler with a milk/chocolate mixture
  }
 }
 
 public void drain() {
  if (!isEmpty() && isBoiled()) {
   System.out.println("���� ��Ḧ ����");
   // drain the boiled milk and chocolate
   empty = true;
  }
 }
 
 public void boil() {
  if (!isEmpty() && !isBoiled()) {
   // bring the contents to a boil
   System.out.println("��㸦 ����");
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
