package com.assignment_task2;

 class Strong_numer {
	
	public int fact(int n) {
		int fact=1,i=n;
		while(i>0) {
			fact*=i;
			i--;
		}
		return fact;
	}
	
	 boolean is_strong(int num) {
		int sum=0;
		int original_number=num;
		while(num!=0) {
			int digit=num%10;
			sum+=fact(digit);
			num=num/10; 
			
		}
		return sum==original_number;
		
		
	}

}
