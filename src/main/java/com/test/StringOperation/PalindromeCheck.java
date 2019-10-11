package com.test.StringOperation;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeCheck {
	static Scanner sc = new Scanner(System.in);
	static String temp="";
	private static ArrayList<String> palindrome = new ArrayList<String>();
	private static ArrayList<String> palindrome_Not = new ArrayList<String>();



	public static void main(String[] args) {
		System.out.println("Enter the number of strings that wants to be checked for palindrome or not");
		int number_of_strings = sc.nextInt();
		for(int i=1;i<=number_of_strings;i++) {
			System.out.println("Enter the string to check whether it is a palindrome or not");
			String text = sc.next();
			for(int j =text.length()-1;j>=0;j--) {
				temp = temp+text.charAt(j);

			}
			/*System.out.println(temp);*/
			if(temp.equals(text)) {
				System.out.println("it is a palindrome");
				palindrome.add(temp);
			}else {
				System.out.println("it is not a palindrome");
				palindrome_Not.add(temp);
			}
			temp = "";
			System.out.println("-----------------------------------");

		}System.out.println("Thats the end of it the list of palindrome from the strings are");
		 for(String s : palindrome) {
			 System.out.println(s);
			 System.out.println("and similarly the list that is not part is as follows");
			 for(String a : palindrome_Not) {
				 System.out.println(a);
			 }
		 }
	}
}
