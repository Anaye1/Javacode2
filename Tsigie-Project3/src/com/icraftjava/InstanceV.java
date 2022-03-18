package com.icraftjava;

public class InstanceV {
	
		int age = 25; // <----InstanceVariable Declared outside methods
		
	public void methodone() {
		int i = 10; // local variable
		
		System.out.println("Value of i:" + i);
		System.out.println("Value of  age:" + age);
		
		}
	public void methodtwo() {
		int k = 30; // local variable
		System.out.println("Value of k:" + k);
		System.out.println("Value of  age:" + age);
		
		}

	public static void main (String[] args) {
		
		InstanceV m2 = new InstanceV();
		
		m2.methodone();
		m2.methodtwo();
	}
	}


