/*Question 11: Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).*/

import java.util.*;
public class SecondLargest{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		int a[]=new int[6];
		
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int largest, second;

        
        if(a[0] > a[1]){
            largest = a[0];
            second = a[1];
        } else {
            largest = a[1];
            second = a[0];
        }
		System.out.println("second largest=");
		for(int i=2;i<a.length;i++){
			if(a[i]>largest){
				second=largest;
			}
			else if(a[i] > second && a[i] != largest){
				second = a[i];
			}
		}
		System.out.println(second);
	}
}

