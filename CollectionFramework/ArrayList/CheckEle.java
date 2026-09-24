/*2. Check Element
Create an ArrayList<Integer> containing 10 numbers.
Write a program to:
- Take a number from the user.
- Check whether that number is present using contains().
- Print an appropriate message.
Example:
Enter number: 30
30 is present in the collection.*/

import java.util.*;
public class CheckEle{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		ArrayList<Integer>list=new ArrayList<>();
		
		System.out.println("enter number of element");
		int n=in.nextInt();
		
		System.out.println("enter element ");
		
		for(int i=0;i<n;i++){
			int num=in.nextInt();
			list.add(num);
		}
		System.out.println("enter number to search");
		int search=in.nextInt();
		
		if (list.contains(search)) {
            System.out.println(search + " is present in the collection.");
        } else {
            System.out.println(search + " is not present in the collection.");
        }
	}
}	