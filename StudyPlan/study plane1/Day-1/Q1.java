/*1. Reverse a String (LC 344) Given a string, write a program to reverse
 the sequence of characters and return the reversed string. The solution 
 should handle all characters correctly while maintaining the original 
 character values. 
 Example: Input: "hello" → Output: "olleh" */
 
 import java.util.*;
 public class Q1{
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 System.out.println("enter string");
		 String s=in.nextLine();
		 
		 char ch[]=new char[s.length()];
		 for(int i=0;i<ch.length;i++){
			 ch[i]=s.charAt(i);
		 }
		 for(int i=ch.length-1;i>=0;i--){
			 System.out.println(ch[i]);
		 }
	 }
 }