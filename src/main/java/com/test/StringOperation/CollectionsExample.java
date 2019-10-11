package com.test.StringOperation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.joda.time.LocalTime;

public class CollectionsExample {

	public static void main(String[] args) {
		String StringAdd = "";
		String StringAge = "";
		String StringName = "";
		LocalTime currentTime = LocalTime.now();
		String local_time = currentTime.toString();
		local_time = local_time.substring(0,5);
		System.out.println(local_time);

		Map<Integer,List> mp = new HashMap<Integer,List>();
		List<String> al = new ArrayList<String>();
		al.add("Nithin");
		al.add("29");
		al.add("Ramapuram");
		
			mp.put(1,al);
			
			for(Entry<Integer,List> k:mp.entrySet()) {
				System.out.println(k.getKey());
				StringName = k.getValue().get(0)+"//"+local_time;
	            StringAge = k.getValue().get(1)+"//"+local_time;
                StringAdd = k.getValue().get(2)+"//"+local_time;
}

	System.out.println(StringName);
	System.out.println(StringAge);
	System.out.println(StringAdd);
	}

}
