/*Question 46: Write a Java program to display all Twin Primes between 1 and n.
Twin Primes are pairs of prime numbers that differ by 2.
Example: (3, 5), (5, 7), (11, 13).
Explanation:
Use loops:
? First, loop through numbers from 2 to n.
? For each, check if it and the next number +2 are both prime using an inner loop.
? If both are prime, print the pair.
Input:

n = 20

Output:

(3,5) (5,7) (11,13) (17,19)

Explanation:

Twin primes are prime numbers that differ by 2.*/
import java.util.*;
public class PrimeNo2{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int found = 0; 

        
        for (int num = 2; found < n; num++) {
            int c = 0; 

           
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    c=c++;
                }
				
            }for(int i=1;i<=num+2;i++){
				if((num+2)%i==0){
					c2++;
				}
			}

			
			if(c1==2 && c2==2 && (num+2)<=n){
				System.out.print("(" + num + "," + (num+2) + ") ");
			}
		}
	}
}