package com.icraftjava;

class EmpInfo{
	String name ="Jamie Foxx"; // Instance
	static String city ="NYC";
			
	}

public class StaticVariableDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.out.println("Employee Name:" + EmpInfo.name);
		//System.out.println("Employee city:" + EmpInfo.city);
		
		EmpInfo m1 = new EmpInfo();
		m1.name = "Ashenafi";
		m1.city ="Addis Ababa";
		
		System.out.println("Employee Name:" + m1.name);
		System.out.println("Employee city:" + m1.city);
		
		System.out.println("\n");
		
		EmpInfo m2 = new EmpInfo();
		System.out.println("Employee name: " + m2.name);
		System.out.println("Employee city: " + m2.city);
				

	}

}
