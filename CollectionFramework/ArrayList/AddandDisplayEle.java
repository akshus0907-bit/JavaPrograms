/*1. Add and Display Elements
Write a Java program using ArrayList to:
- Add 5 student names.
- Display all students.
- Display the total number of students using size().*/

import java.util.*;
 public class AddandDisplayEle{
	 public static void main(String[]args){
		 ArrayList<String>list=new ArrayList<>();
		 list.add("ram");
		 list.add("Shyam");
		 list.add("karan");
		 list.add("rushi");
		 list.add("rahul");
		 
		 Iterator<String>iterator=list.iterator();
		 
		 while(iterator.hasNext()){
			 String str=iterator.next();
			 System.out.println(str);
		 }
	 }
 }