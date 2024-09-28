package com.interface_implementation;
import java.util.*;
import java.util.Scanner;

 interface Calculator {

	public void add();
	public void subtract();
	public void division();
	public void multiplication();
	
	
}

class child implements Calculator{
	Scanner sc=new Scanner(System.in);
	double a,b;

	@Override
	public void add() {
		System.out.println("enter the value of a and b");
		a=sc.nextDouble();
		b=sc.nextDouble();
		double c=a+b;
		System.out.println("addition of 2 no. is "+c);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subtract() {
		System.out.println("enter the value of a and b");
		a=sc.nextDouble();
		b=sc.nextDouble();
		double c=a-b;
		System.out.println("subtraction of 2 no. is "+c);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void division() {
		System.out.println("enter the value of a and b");
		a=sc.nextDouble();
		b=sc.nextDouble();
		double c=a/b;
		// TODO Auto-generated method stub
		System.out.println("division of 2 no. is "+c);
		
	}

	@Override
	public void multiplication() {
		System.out.println("enter the value of a and b");
		a=sc.nextDouble();
		b=sc.nextDouble();
		double c=a*b;
		System.out.println("multiplication  of 2 no. is "+c);
		// TODO Auto-ge
		// TODO Auto-generated method stub
		
	}
	
}

public class Method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c1=new child();
		c1.add();
		c1.subtract();
		c1.division();
		c1.multiplication();
		

	}

}
