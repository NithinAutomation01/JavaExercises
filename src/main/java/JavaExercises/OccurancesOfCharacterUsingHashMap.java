package JavaExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class OccurancesOfCharacterUsingHashMap  {

	public static void main(String[] args) {
		String name = "NNNNNNL";
		int count =1;
		char[] charArray = name.toCharArray();
		Map<Character,Integer> mp = new TreeMap<Character,Integer>();
		for(int i =0; i<charArray.length;i++) {
			if(mp.containsKey(charArray[i])) {
				mp.put(charArray[i],count++);
			}else {
				mp.put(charArray[i],count);
			}


		}



		for(Entry<Character,Integer> al:mp.entrySet()) {
			System.out.println(al.getKey()+"     "+al.getValue());
		}


	}


}