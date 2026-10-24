//String in LinkedHashSet

import java.util.*;

class StringInLinkedHashSet{
	public static void main(String[]args){
		LinkedHashSet<String>lh=new LinkedHashSet<>();
		
		lh.add("sql");
		lh.add("html");
		lh.add("css");
		lh.add("java");
		lh.add("python");
		
		Iterator<String>it=lh.iterator();
		
		while(it.hasNext()){
			String val=it.next();
			
			System.out.println(val);
		}
	}
}