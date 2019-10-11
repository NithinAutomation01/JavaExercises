package com.test.StringOperation;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeRecord {

	public static void main(String[] args) {
		String records[] = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the total employees to be inserted in the db");
		int value = sc.nextInt();
		for(int i = 0 ;i<value;i++) {
			System.out.println("enter the name");
			records[i] = sc.next();
		}

		for(String a : records) {
			System.out.println(a);
		}
	}

}


