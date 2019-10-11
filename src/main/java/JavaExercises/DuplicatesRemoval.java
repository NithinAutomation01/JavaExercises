package JavaExercises;

import java.util.ArrayList;

public class DuplicatesRemoval {

	public static void main(String[] args) {
		int count = 0;
		int var2 = 0;
		ArrayList<Integer> tot = new ArrayList<Integer>();
		int[] var = {23,43,23,54,63,45,43,23,54,6,5,4,2,42,65};
		for(int i =0 ;i<var.length;i++) {
			for(int j =0 ;j<var.length;j++) {
				if(var[i]==var[j]) {
							count++;
							if(count>1) {
								
								System.out.println("more than one number of : "+var[i]+" is observed");
								var2 = var[i];
							
							}
							
							

				

				}


			}

		}
	}

}
