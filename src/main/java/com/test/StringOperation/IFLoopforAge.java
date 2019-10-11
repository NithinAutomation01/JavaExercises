package com.test.StringOperation;

public class IFLoopforAge {

	public static void main(String[] args) {
		int age = 9;
		if(age<=17) {
			System.out.println("child");
		}else if(age>18 && age<=60) {
			System.out.println("Adult");
		}else {
			System.out.println("Senior Citizen");
		}
	}

}
