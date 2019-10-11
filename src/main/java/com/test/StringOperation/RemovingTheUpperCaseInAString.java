package com.test.StringOperation;
//Number of occurances of all capital letter and print only small letters

// IP : AmaZon  OP : maon


public class RemovingTheUpperCaseInAString { 
	public static void main(String[] args) {
		String Input ="AmaZon";
		String temp =Input;
		String difference = "";
		String lower_case = Input.toLowerCase();
		for(int i =0;i<Input.length();i++) {

			if(temp.charAt(i)==lower_case.charAt(i)){
				difference = difference + Input.charAt(i);

			}

		}System.out.println(difference);

	}

}
