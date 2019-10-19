package JavaExercises;

public class DuplicatesRemovalSuresh {

	public static void main(String[] args) {


		String test ="malayalam,kalash,pradeep";
		String[] test_split = test.split(",");
		String temp ="";

		for(int k = 0;k<test_split.length;k++) {
			String value_test = test_split[k];
			


			for(int i = value_test.length()-1;i>=0;i--) {
				temp = temp + value_test.charAt(i);

			}
		

			System.out.println(temp);
			if(temp.equals(value_test)) {
				System.out.println("palindrome");
			}else {
				System.out.println("Not palindrome");
			}
			temp= "";
			System.out.println("-------------------------------------");
		}

		}


	}
