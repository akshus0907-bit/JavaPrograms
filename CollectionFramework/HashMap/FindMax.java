//Find the maximum occurring element

import java.util.Map;
import java.util.HashMap;

public class FindMax{
	public static void main(String[]args){
		 
		 int a[]={10,20,30,40,40};
		 
		 Map<Integer,Integer>map=new HashMap<>();
		 
		 for(int i=0;i<a.length;i++){
			if(map.containsKey(a[i])){
				map.put(a[i],map.get(a[i])+1);
			}
			else{
				map.put(a[i],1);
			}
		 }
		 int max=0;
		 int element=0;
		 
		 for(Map.Entry<Integer,Integer> entry:map.entrySet()){
			 if(entry.getValue()>max){
				 max=entry.getValue();
				 element=entry.getKey();
			 }
			 
			 
		 }
		 System.out.println(element+"="+max);
	}
}