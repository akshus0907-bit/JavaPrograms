/*Question 9: Write a java program to copy one array to another array.
Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment*/

import java.util.*;
public class CopyEle{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		int a[]=new int[4];
		int b[]=new int[4];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}
		
		