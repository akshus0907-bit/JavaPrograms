//frequemce of elemetn

import java.util.*;

public class FrequenceEle{
	public static void main(String[]args){
		int a[]={10,20,30,30,10	};
		Map<Integer,Integer>map=new HashMap<>();
		
		for(int i=0;i<a.length;i++){
			if(map.containsKey(a[i])){
				map.put(a[i],map.get(a[i])+1);
			}
			else{
			   map.put(a[i],1);
			}
		}
			
			System.out.println(map);
		
		
	}
}