package com.Vaccine_oops;
import java.util.*;
public abstract  class Vaccine {
	Scanner sc=new Scanner(System.in);
	int age;
	String nationality;
	boolean firstdose=false;
	boolean seconddose=false;
	public void values(){
		System.out.println("enter the age and nationality of a person");
		age=sc.nextInt();
		nationality=sc.next();
		
	}
	public int get_Age() {
		return age;
	}
	public String get_Nationality() {
		return nationality;
	}
	public void   eligibility_firstDose() {
		if(get_Age()>=18 && get_Nationality().equalsIgnoreCase("Indian")) {
			System.out.println("person is eligible for firstDose vaccination and vacccination successful");
			System.out.println("Person is required to pay 250 INR");
			firstdose=true;
		}
		else {
			System.out.println("person is not eligible for first dose");
		}
		
	}
	
	
	public void  check_secondDose() {
		if(firstdose) {
			System.out.println("person is eligible for the second dose");
			seconddose=true;
		
			
		}
		else {
			System.out.println("person is not eligible for second dose");
		}
	}
	
	abstract void boosterDose();

}
