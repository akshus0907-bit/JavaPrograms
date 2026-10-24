//LinkedHashSet

import java.util.*;
class Test{
	
	public static void main(String[]args)
	{
		
		
		LinkedHashSet<Integer> lh=new LinkedHashSet<>();
		
		lh.add(10);
		lh.add(20);
		lh.add(30);
		lh.add(40);
		lh.add(10);
		lh.add(20);
		lh.add(30);
		
		
		Iterator <Integer>it=lh.iterator();
		while(it.hasNext()){
			int value=it.next();
			
			System.out.println(value);
			
		}
	 }
}