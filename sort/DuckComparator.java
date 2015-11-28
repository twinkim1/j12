package com.j2.templatemethod.sort;
import java.util.*;
public class DuckComparator implements Comparator{
	 
	public int compare(Object obj1,Object obj2) {
		Duck duck1 = (Duck)obj1;
		Duck duck2 = (Duck)obj2;
  
		if (duck1.weight < duck2.weight) {
			return -1;
		}
		else if (duck1.weight == duck2.weight) {
			return 0;
		} 
		else { 
			return 1;
		}
	}
}
