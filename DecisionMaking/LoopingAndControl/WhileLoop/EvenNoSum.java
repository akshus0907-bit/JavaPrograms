/*Question 7: Write a java program to find the sum of all even numbers between 1 to n.
Input:

n = 10

Output:

Sum = 30

Explanation:

Even numbers between 1 and 10 are 2, 4, 6, 8, 10.
Their sum is 2 + 4 + 6 + 8 + 10 = 30.*/

        /*while (count <= n) {
            sum = sum + count; 
            count = count + 2; 
        }

        System.out.println("Sum = " + sum);
    }
}*/

import java.util.*;

public class EvenNoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        
        int sum = 0;
        int count = 2; 

		while(count<=n){
			if(count%2==0){
				sum=sum+count;
				
			}
			count++;
			
			
			
		}
		System.out.print(sum);
		
		
	}
}
		
