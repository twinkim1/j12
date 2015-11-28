package com.j2.decorator;

public class Espresso extends Beverage
{
  public Espresso(){
    description="Espresso coffee";
  }
  
  public double cost(){
    return 1.0;
  }
}