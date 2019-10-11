package JavaExercises;

public class T1234 {
	public static void main(String args[]){

		String values= "This is to manage the reverse of even strings alone";
		String[] val = values.split(" ");
		String temp = "";
		int v =val.length;
		for(int k = 0; k<v;k+=2) {
			String text = val[k];
			for(int j =text.length()-1;j>=0;j--) {
				temp = temp +text.charAt(j);
			
						}
			System.out.println(temp);
			temp = "";
			System.out.println("----------------------");

			}

		}

	}