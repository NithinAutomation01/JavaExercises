package JavaExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class hashMapWorkingLogics {

	public static void main(String[] args) {
		String text = "This is to signify that the z has been able to manage with emperior";
		int count =1;
		ArrayList<Character> al = new ArrayList<Character>();
		char[] charArray = text.toCharArray();
		Map<Character,Integer> hm = new TreeMap<Character,Integer>();
		for(int i =0;i<charArray.length;i++) {
			if(hm.containsKey(charArray[i])) {
				hm.put(charArray[i],count+1);


			}else {
				hm.put(charArray[i],count);
			}
		}  for(Entry<Character, Integer> o:hm.entrySet()) {
					if(o.getValue()>1) {
						al.add(o.getKey());
					}
					
				
		}
		String t = al.toString();
			String[]	t1 = t.split(",");
			for(String h : t1) {
				System.out.print(h);
			}
			
	}
}
