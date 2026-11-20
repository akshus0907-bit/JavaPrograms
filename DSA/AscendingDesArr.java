/*Question 40: Write a Java program to sort a given array in ascending & descending order.
Input:
Array = [12, 5, 9, 34, 1]

Output:
Ascending Order = [1, 5, 9, 12, 34]
Descending Order = [34, 12, 9, 5, 1]

Explanation:
Arrange elements from smallest to largest for ascending order and reverse the order for descending.

Asked In Companies:
Practice assignment*/
import java.util.*;
public class AscendingDesArr{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter array element");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		//Array in Ascending order
		Arrays.sort(a);
		System.out.println("array in Ascending order=");
		for(int i=0;i<a.length;i++){
		
		System.out.println(a[i]);
	}
	//Descending order
		System.out.println("array in Descending order=");
	for(int i=a.length-1;i>=0;i--){
		System.out.println(a[i]);
	}
	}
}
