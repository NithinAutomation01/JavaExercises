package JavaExercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetSort {

	public static void main(String[] args) {
		Set<String> al = new HashSet<String>();

		al.add("Nithin");
		al.add("Sathesh");
		al.add("Sahish");
		al.add("karthick");
		al.add("praveen");
		al.add("Saveen");
		System.out.println("Starting with S -----------------------");
		for(String o : al) {

			if(o.startsWith("S")) {

				System.out.println(o);
			}
		}

	}

}
