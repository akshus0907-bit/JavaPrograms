/*Question 6: Write a java program to search an element in an array , its element found or not.
Input:
Array = {10, 20, 30, 40, 50}
Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".*/

import java.util.*;
public class SearchEle{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		int a[]=new int[5];
		int key=30;
		boolean found=false;
		int index=-1;
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length;i++){
			if(a[i]==key ){
				found=true;
				index=i;
				
			}
		}
		if(found){
			System.out.println("element "+key+" found at index "+index);
		}
	}
}
				
			