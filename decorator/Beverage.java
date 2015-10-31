package com.j2.decorator; 

public abstract class Beverage {
  String description="Unknown Bverage";
  public String getDescription(){
    return description;
    
}
  public abstract double cost();
}
