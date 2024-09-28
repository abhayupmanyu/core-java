package com.looseCoupling1;
 interface Bank_type {
	void R_O_I();

}

  class Bank {
		Bank_type b;
		Bank(Bank_type b){
			this.b=b;
			
		}
		void bank_roi() {
			System.out.println("Every Bank has its own rate of interesrt");
			b.R_O_I();
		}

	}

 class Hdfc implements Bank_type{

		public void R_O_I() {
			System.out.println("rate of interest for Hdfc bank is 8.65%");
			
		}
		
		
	}

  class Sbi implements Bank_type {

		@Override
		public void R_O_I() {
			// TODO Auto-generated method stub
			System.out.println("SBi rate of interest is 7.00%");
			
		}

		
	}

 


public class LooseCoupling {
	public static void main(String [] args) {
	Bank b1=new Bank(new Sbi());
             b1.bank_roi();
             Bank b2=new Bank(new Hdfc());
             b2.bank_roi();
	

}
}