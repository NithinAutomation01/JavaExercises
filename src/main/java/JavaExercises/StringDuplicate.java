package JavaExercises;

public class StringDuplicate {

	public static void main(String[] args) {
		String val = "AmaZon";
		String diff = "";
		String val_tolower = val.toLowerCase();
		for(int i =0;i<val.length();i++) {
			if(val.charAt(i)==val_tolower.charAt(i)) {
				diff = diff + val.charAt(i);

			}

		}System.out.println(diff);

	}

}
