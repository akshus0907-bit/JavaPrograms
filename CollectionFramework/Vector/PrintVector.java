//print vector data using iterator



import java.util.*;

public class PrintVector{
	public static void main(String[]args){
		
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		
		 Iterator<Integer> t=v.iterator();
		while(t.hasNext()){
			int val=(int)t.next();
			System.out.println(val);
				
			}
		}
	}
