package com.Vaccine_oops;

public class Vaccination_Successful extends Vaccine {

	@Override
	void boosterDose() {
		// TODO Auto-generated method stub
		if(firstdose &&  seconddose){
			System.out.println("Person has completed both the dose and is successfully vaccinated");
			
		}
		else {
			System.out.println("Person is not vaccinated completely");
		}
		
	}
	

}
