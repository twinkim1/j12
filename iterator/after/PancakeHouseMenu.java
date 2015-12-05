package com.j2.iterator.dinermerger.after;
import java.util.ArrayList; 
public class PancakeHouseMenu implements Menu {
    ArrayList menuItems; 
    public PancakeHouseMenu() { 
        menuItems = new ArrayList(); 
        addItem("K&B's Pancake Breakfast",
        		"Pancakes with scrambled eggs, and toast", true, 2.99); 
        addItem("Regular Pancake Breakfast", 
        		"Pancakes with fried eggs, sausage", false, 2.99); 
        addItem("Blueberry Pancakes", 
        		"Pancakes made with fresh blueberries", true, 3.49); 
        addItem("Waffles", "Waffles, "
        		+ "with your choice of blueberries or strawberries", true, 3.59);
        addItem("치즈케익", 
        		"치즈로 만든 치즈케익", true, 2.99);
        addItem("블루베리 케익", 
        		"블루베리를 넣은 블루베리 케익", true, 3.49); 
        addItem("호두파이",
        		"호두를 넣은 파이", true, 3.75); 
    } 
    public void addItem(String name, String description, boolean vegetarian, double price) { 
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price); 
        menuItems.add(menuItem); 
    } 
    public ArrayList getMenuItems() { 
        return menuItems; 
    } 
    public Iterator createIterator() { 
        return new PancakeHouseMenuIterator(menuItems); 
    } 
    public String toString() { 
        return "Objectville Pancake House Menu"; 
    } 
} 
