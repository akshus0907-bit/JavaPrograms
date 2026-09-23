/*Q3. Create an ArrayList<Integer>:

10, 20, 30, 40, 50

Use an Iterator to remove 30 during traversal.

Expected final collection:

10 20 40 50*/

import java.util.*;

public class RemoveEle{
	public static void main(String[]args){
		ArrayList<Integer>list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator<Integer>iterator=list.iterator();
		while(iterator.hasNext()){
			 Integer number=iterator.next();
			 if(number==30)
			
			 iterator.remove();
			
		}
		
	
	for(Integer num:list){
		System.out.println(num);
	}
	}
}