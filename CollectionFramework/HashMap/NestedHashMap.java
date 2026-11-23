//nested hashmap

import java.util.*;
public class NestedHashMap{
	public static void main(String[]args){
		
		LinkedHashMap<String,LinkedHashMap<Integer,String>>dept=new LinkedHashMap<String,LinkedHashMap<Integer,String>>();
		
		LinkedHashMap<Integer,String>FE=new LinkedHashMap<Integer,String>();
		FE.put(1,"A");
		FE.put(2,"B");
		FE.put(3,"C");
		
		dept.put("FE",FE);
		
		
		LinkedHashMap<Integer,String>SE=new LinkedHashMap<Integer,String>();
		
		SE.put(1,"abc");
		SE.put(2,"pqr");
		SE.put(3,"xyz");
		
		dept.put("SE",SE);
		
		
		Set<Map.Entry<String,LinkedHashMap<Integer,String>>>set=dept.entrySet();
		for(Map.Entry<String,LinkedHashMap<Integer,String>>m:set){
			System.out.println(m.getKey());
			
			System.out.println("-----------------------------");
			
			LinkedHashMap<Integer,String> c=m.getValue();
			Set<Map.Entry<Integer,String>>sdata=c.entrySet();
			
			for(Map.Entry<Integer,String>s:sdata){
				System.out.println(s.getKey()+"\t"+s.getValue());
			}
		}

		
			
		}
	}
