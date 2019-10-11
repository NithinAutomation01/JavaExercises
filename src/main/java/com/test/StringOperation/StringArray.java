package com.test.StringOperation;

public class StringArray {
	
	public static void main(String[] args) {
		
		String value = "nithin,praveen,prakash,asdfgasd,asfjkdf,";
		String[] value1 = value.split(",");
		for(String a : value1)
		System.out.println(a);
	}

}
