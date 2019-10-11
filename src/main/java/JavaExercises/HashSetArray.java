package JavaExercises;

import java.util.HashSet;

public class HashSetArray {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		String value = "23,23,23,23,23,14,45,23,67";
		String[] value_Array = value.split(",");
		for(int i =0;i<value_Array.length;i++) {

			hs.add(value_Array[i]);
		}
			for(String o : hs) {
				System.out.print(o+" ");
			}
	}

}
