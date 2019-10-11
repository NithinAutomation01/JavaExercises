package com.test.StringOperation;

//basic program to calculate the Alphabets and Numbers in a Given String
public class CountAlphabetsNumbersInString {

	public static void main(String[] args) {
		String value = "1a2b3cd";
		int count =0;
		int alpha =0;
		
		
		for(int i=0;i<value.length();i++) {
			if(Character.isDigit(value.charAt(i))) {
				count = count+1;
				/*System.out.println("count is added" +count);
				*/
			}
			if(Character.isLetter(value.charAt(i))) {
				
				alpha =alpha+1;
				/*System.out.println("alpha count is added : " +alpha);
				*/
			}
			
			
			
			
			
		}
		
		
		System.out.println("total numbers is : "+count+ " Total alpha count is : " +alpha);
	}

}
