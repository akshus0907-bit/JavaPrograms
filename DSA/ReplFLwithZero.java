/*Question 31: Replace First and Last Element with 0.
Input:
Array = [5, 3, 7, 2]

Output:
Array = [0, 3, 7, 0]

Explanation:
Update the first and last positions of the array with 0 and leave the middle elements unchanged.*/
import java.util.*;
public class ReplFLwithZero{
	public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	System.out.println("enter array element");
	int a[]=new int[5];
	for(int i=0;i<a.length;i++){
		a[i]=in.nextInt();
	}
	
	a[0]=0;
	a[a.length-1]=0;
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	}
}
	