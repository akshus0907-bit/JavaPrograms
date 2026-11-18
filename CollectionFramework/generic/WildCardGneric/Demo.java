//wild class generic

import java.util.*;
class ABC{
	static  void display(List<?> list){
		for(Object value:list){
			System.out.println(value);
		}
	}
	
}	

public class Demo{
	public static void main(String[]args){
	   List<Integer>l1=Arrays.asList(10,20,30);
	   List<Float>l2=Arrays.asList(10.5f,20.5f);
	   ABC.display(l1);
	   ABC.display(l2);
	}
}
