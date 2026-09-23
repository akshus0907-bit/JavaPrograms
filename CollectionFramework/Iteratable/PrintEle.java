/*Q1 Create an ArrayList<Integer> containing:

10, 20, 30, 40, 50

Use Iterator to traverse and print all elements.*/

import java.util.*;
 public class PrintEle{
	 public static void main(String[]args){
		 ArrayList<Integer>list=new ArrayList<>();
		 
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 
		 Iterator<Integer>iterator=list.iterator();
		 while(iterator.hasNext()){
			Integer number=iterator.next();
			System.out.println(number);
		 }
	 }
 
 }
 