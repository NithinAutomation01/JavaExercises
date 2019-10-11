package com.test.StringOperation;

public class ReverseOfEvenStrings {

	public static void main(String[] args) {
		String value = " This is to ensure the reverse of the strings are in place";
		String[] value_StringArray = value.split(" ");
		String var = value_StringArray.toString();
		System.out.println(var);
		String temp = "";
		System.out.println(value_StringArray.length);
		for(int i =0; i<value_StringArray.length;i+=2){
			String original = value_StringArray[i];
			for (int j =original.length()-1 ;j>=0;j--) {
				temp = temp + original.charAt(j);
			}System.out.println("the reverse of the string : "+original+" is : " +temp);
			System.out.println("------------------------------");
			temp ="";

		}

	}

}
