package com.icraftjava;

public class StaticVariableDemo {

	public static double salary; //Static variable
	public static String dept = "Finance";  //static variable
	 int age = 25; //instance variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StaticVariableDemo m1 = new StaticVariableDemo();
		//m1.salary = 4000;
		//m1.age = 35;
		
		StaticVariableDemo.salary =4000;
		System.out.println(StaticVariableDemo.salary);
		System.out.println(StaticVariableDemo.dept);
		
	}
	
}
