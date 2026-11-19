//find first non reperting char in string 

import java.util.Map;
import java.util.HashMap;

public class FirstNonReperatingChar{
	public static void main(String[]args){
		
		String str="swiss";
		
		Map<Character,Integer>map=new HashMap<>();
		
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
		
			if(map.containsKey(ch)){
				
				map.put(ch,map.get(ch)+1);
			}
			else{
				map.put(ch,1);
			}
			
				
		}
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(map.get(ch)==1){
				System.out.println(ch);
			    break;
			}
		}
	}
}