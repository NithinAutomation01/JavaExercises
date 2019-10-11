package JavaExercises;

import java.util.HashSet;

public class DefListing {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		HashSet<String> hs1 = new HashSet<String>();

		String[] value = {"nithin","nithin","kathik","praveen","praveen","pramod"};
		int[] list = {23,43,23,5,5,5,5,5,5,23,45,23,53};
		int val =list.length;
		for(int k = 0 ; k<value.length;k++) {
			hs1.add(value[k]);
			
		}for(String s : hs1) {
			System.out.println(s);
		}
		for(int i =0 ; i<val;i++) {
			hs.add(list[i]);
		}
		for(Integer a :hs) {
			System.out.println(a);
		}
	}
	

}
