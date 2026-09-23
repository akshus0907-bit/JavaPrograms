/*Q2. Create an ArrayList<String> containing:

Java
SQL
HTML
CSS

Use iterator() and print each element.*/

import java.util.*;
public class PrintStr{
	public  static void main(String[]args){
		ArrayList<String>list=new ArrayList<>();
		
		list.add("Java");
		list.add("SQL");
		list.add("HTML");
		list.add("CSS");
		
		Iterator<String>iterator=list.iterator();
		
		while(iterator.hasNext()){
			String str=iterator.next();
			System.out.println(str);
		}
	}
}