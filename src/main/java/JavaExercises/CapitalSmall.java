package JavaExercises;
//Number of occurances of all capital letter and print only small letters


public class CapitalSmall { 
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
