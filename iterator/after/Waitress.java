package com.j2.iterator.dinermerger.after;

public class Waitress { 
    PancakeHouseMenu pancakeHouseMenu; 
    DinerMenu dinerMenu; 
   
    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) { 
        this.pancakeHouseMenu = pancakeHouseMenu; 
        this.dinerMenu = dinerMenu; 
    } 
    public void printMenu() { 
        Iterator pancakeIterator = pancakeHouseMenu.createIterator(); 
        Iterator dinerIterator = dinerMenu.createIterator(); 
        System.out.println("       MENU    \n    ��ħ     "); 
        printMenu(pancakeIterator); 
        System.out.println("\n   ����       "); 
        printMenu(dinerIterator); 
    }
    private void printMenu(Iterator iterator) { 
        while (iterator.hasNext()) { 
        	MenuItem menuItem = (MenuItem)iterator.next(); 
            System.out.print(menuItem.getName() + ", $"); 
            System.out.print(menuItem.getPrice() + " __ "); 
            System.out.println(menuItem.getDescription()); 
        } 
    } 
    public void vegetarianprintMenu() { 
    	Iterator pancakeIterator = pancakeHouseMenu.createIterator(); 
    	Iterator dinerIterator = dinerMenu.createIterator(); 
        System.out.println ("     Vegetarian  MENU    \n   Vegetarian ��ħ     ");
    	vegetarianprintMenu(pancakeIterator); 
        System.out.println("\n   Vegetarian ���� "); 
    	vegetarianprintMenu(dinerIterator); 
    	    } 
    private void vegetarianprintMenu(Iterator iterator) { 
    	    while (iterator.hasNext()) { 
    	    MenuItem menuItem = (MenuItem)iterator.next(); 
    	    if(menuItem.vegetarian){ 
    	    System.out.print(menuItem.getName() + ",$ "); 
    	    System.out.print(menuItem.getPrice() + " __"); 
    	    System.out.println(menuItem.getDescription()); 
    	            } 
    	        } 

    	    } 

    	} 
