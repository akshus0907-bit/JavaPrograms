/*4Find the smallest element without Collections.min().*/

import java.util.*;
public class SmallestEle{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		List<Integer>list=new ArrayList<>();
		
		System.out.println("enter number of element");
		int n=in.nextInt();
	
	 System.out.println("enter element ");
	 for(int i=0;i<n;i++){
		 int num=in.nextInt();
		 
		 list.add(num);
	 }
	 
	 int min=list.get(0);
	 for(int i=0;i<n;i++){
		 if(list.get(i)<min){
			 min=list.get(i);
		 }
	 }
	 System.out.println("smallest element is "+min);
	}
}