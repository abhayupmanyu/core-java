package com.assignment_task2;
import java.util.*;
 class Second_highest {
	int a[]= {2,4,5,3,6,7,9,4,5,6};
	
	int a1=2,b1=6;
	int largest=Integer.MIN_VALUE;
	int second_largest=Integer.MIN_VALUE ;
	void find() {
	for(int i=a1;i<=b1;i++) {
		if(a[i]>largest) {
			second_largest=largest;
			largest=a[i];
		}
		else if(a[i]>second_largest && a[i]<largest) {
			second_largest=a[i];
		}
		
	}
	System.out.println("largest element in the array is"+largest);
	System.out.println("second largest element in the array is"+second_largest);
	
	

}
}