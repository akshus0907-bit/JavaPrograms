//find Duplicate

import java.util.Map;
import java.util.HashMap;

public class FindDuplicate{
	public static void main(String[]args){
		
		int a[]={10,20,30,10,20,40};
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<a.length;i++){
			if(map.containsKey(a[i])){
				map.put(a[i],map.get(a[i])+1);
			}
			else{
				map.put(a[i],1);
			}
		}
		
		for(Map.Entry<Integer,Integer>entry:map.entrySet()){
			if(entry.getValue()>1){
				System.out.println("duplaicte"+entry.getKey());
			}
		}
	}
}