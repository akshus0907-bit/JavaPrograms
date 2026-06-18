/*1. Print each character of a string.*/

import java.util.*;
public class PrintEachCharStrQ1{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String str=sc.nextLine();
	
	System.out.println("character in string");
	for(int i=0;i<str.length();i++){
		System.out.println(str.charAt(i));
	}
	}
}