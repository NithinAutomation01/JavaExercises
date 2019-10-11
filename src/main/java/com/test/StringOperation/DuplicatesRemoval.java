package com.test.StringOperation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatesRemoval {

	public static void main(String[] args) {

		int value[] = {1,34,34,2,3,3,3,3,3};
		int len= value.length;
		int count =0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i =0;i<len;i++) {
			if(map.containsValue(value[i])) {
				map.put(value[i],count+1);
			}
			else {
				map.put(value[i],count);
			}
		}
		
		for(Entry<Integer, Integer> hmt:map.entrySet()) {
			System.out.println(hmt.getKey());
		}

	}
}