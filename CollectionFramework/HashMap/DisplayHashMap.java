//hashmap

import java.util.*;

public class DisplayHashMap{
	public static void main(String[]args){
		Map<Integer,String>map=new HashMap<>();
		
		map.put(1,"amc");
		map.put(2,"pqr");
		map.put(3,"xyz");
		
		System.out.println(map.containsKey(1));
		
		System.out.println(map);
		System.out.println(map.put(1,"aksh"));
		
		System.out.println("map after updation "+map);
		
		
		Set<Integer>keys=map.keySet();
		
		for(Integer value:keys){
			System.out.println(value+""+map.get(value));
		}
	}
}