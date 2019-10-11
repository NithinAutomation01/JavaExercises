package JavaExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.poi.util.SystemOutLogger;

public class OccurancesThruHashMap {

	public static void main(String[] args) {
		String text = "PayPPPPal India";
		int count =1;
		char[] charArray = text.toCharArray();
		Map<Character,Integer> map = new TreeMap<Character,Integer>();
		for(int i =0 ;i<charArray.length;i++) {
			if(map.containsKey(charArray[i])) {
				map.put(charArray[i],count++);
			}else {
				map.put(charArray[i],count);
			}
				
			}
			
			
	for(Entry<Character,Integer> hm :map.entrySet()) {
				System.out.println(hm.getKey()+"    "+hm.getValue());
				
	}}

}
