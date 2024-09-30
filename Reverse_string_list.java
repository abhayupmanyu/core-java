package com.sum_of_even;
import java.util.*;
public class Reverse_string_list {
	
	
	static  List<String> reverse_string(List<String> list){
		  
		  List<String> reverselist=new ArrayList<>();
		  for(int i=list.size()-1;i>=0;i--) {
			  reverselist.add(list.get(i));
			  
		  }
		  
		  return reverselist;
		  
	  }
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		List<String> s=new ArrayList<>(n);
		
		System.out.println("enter the values in the ArrayList");
		for(int i=0;i<n;i++) {
			s.add(sc.next());
		}
		System.out.println("The Actual List of String is : ");
        System.out.println(s);
		System.out.println("Reversed List of String is :");
		System.out.println(reverse_string(s));
		
	}

}
