package com.test.StringOperation;

import java.util.Scanner;

//stores the string objects in an Array and with the index we can refer an object//

public class StoringStringObjectsInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String  models[] = {"maruti","Ritz","Ambaszdor","hyundai"};
		String test = models[2];
		System.out.println(test);
		
		
		
		
		
		System.out.println("list of cars  : ");
		System.out.println("---------------------");
		for(String a :models) {
			 if(a.equals("maruti")) {
				 System.out.println("maruti found");
				 System.out.println("----------------------");
			 }
			System.out.println(a);
		}

	}

}
