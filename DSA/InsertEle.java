/*Question 12: Write a program in java to insert an element at desired position from an array.
Input the size of array : 6

Input 5 elements in the array in ascending order :
1 2 3 4 5

Input the position where to insert : 2
Value : 200

Expected Output : The new list is : 1 2 200 3 4 5*/
import java.util.*;
public class InsertEle{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		int a[]=new int[10];
		int size=5;
		
		System.out.println("Enter 5 elements:");
		for(int i=0;i<size;i++){
			a[i]=in.nextInt();
		}
		
		System.out.println("Enter number to insert:");
		int n=in.nextInt();
		
		System.out.println("Enter position:");
		int pos=in.nextInt();
		
		pos = pos - 1;

		if(size == a.length){
			System.out.println("Array is full");
			return;
		}
		if(pos < 0 || pos > size){
			System.out.println("Invalid position");
			return;
		}
		
		for(int i=size-1;i>=pos;i--){
			a[i+1]=a[i];
		}
		
		a[pos] = n;
		size++;
		
		System.out.println("Updated array:");
		for(int i=0;i<size;i++){
			System.out.print(a[i] + " ");
		}
	}
}