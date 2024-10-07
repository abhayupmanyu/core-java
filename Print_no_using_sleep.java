package com.thread_10;
import java.util.*;
public class Print_no_using_sleep implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("the value of i is: "+i);
		}
		
	}
	
	
	public static void main(String [] args) {
		Print_no_using_sleep p=new Print_no_using_sleep();
		Thread t=new Thread(p);
	    t.start();
		
		
	}
	

}
