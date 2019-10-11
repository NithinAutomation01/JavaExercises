package com.test.StringOperation;

public class OccurancesOFaGivenString {

	public static void main(String[] args) {
		int count = 0;
		String text = "Amazon India Dev Centre has been established in the year 2004 and it has been able to recognize in India in 24 cities";
		String[] text_Split = text.split(" ");
		int lengh = text_Split.length;
		for(int i =0;i<lengh;i++) {
			/*System.out.println(text_Split[i]);*/
			if(text_Split[i].equals("India")) {
				count++;
			}
		}System.out.println("Occurances of India is " +count);





	}

}
