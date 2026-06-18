/*Question 10: Write a program in java to delete an element at desired position from an array.
Input the size of array : 5

Input 5 elements in the array in ascending order :
1 2 3 4 5

Input the position where to delete : 3

Expected Output : The new list is : 1 2 3 5*/
import java.util.*;
public class DeleteEle{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		 System.out.println("Enter position to delete:");
        int pos = in.nextInt();

        int index = pos - 1; 
		for(int i=0;i<a.length-1;i++){
			a[i]=a[i+1];
		}
		for (int i=0;i<a.length-1;i++){
			System.out.println(a[i]);
		}
	}
}