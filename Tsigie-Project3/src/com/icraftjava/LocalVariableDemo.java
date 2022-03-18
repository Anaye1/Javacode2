package com.icraftjava;

public class LocalVariableDemo {
		
	public void methodone(){
	
		int j = 25; // --------local variable
	
	System.out.println("Value of j:" +j); //25
}
	
	public void methodtwo() {
		int k = 30;  // Local variable
		int j = 35;
		
		System.out.println("value of k:" + k); //30
		System.out.println("value of j:" + j);
		
	}

	 public static void main(String[] args) {
		 
		 //object create 
		 LocalVariableDemo m1= new LocalVariableDemo();
		 
		 // call the methods inside the class
		 
		 m1.methodone();
		 m1.methodtwo();
	 }
	 
}

