/*1. Create a Vector and display all elements*/

import java.util.*;
public class VectorDemo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		Vector<Integer>vs=new Vector<>();
		
		vs.add(10);
		vs.add(20);
		System.out.println("ëlement in vector");
		for(int i=0;i<vs.length;i++){
			System.out.println(vs.get(i));
		}
	}
}
	
