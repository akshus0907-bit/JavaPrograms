/*Question 50: Write a java program to find unique value in this given array.
Input:
Array = [1, 2, 3, 5, 1, 5, 20, 2, 12, 10]

Output:
Unique Elements = [3, 20, 12, 10]

Explanation:
Count occurrences of each element and print those elements that appear exactly once.*/
import java.util.*;

public class FindUniqueValArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of element in aaray");
		int n=in.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter element in aaray");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length;i++){
			int count=0;
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
				}
			}
			if(count==1){
				System.out.println(a[i]);
			}
		}
	}
}
						