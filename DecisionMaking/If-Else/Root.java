/*Question 28: Write a java program to find all roots of a quadratic equation using if else. How to find all roots 
of a quadratic equation using if else in java programming.
Input:
a = 8
b = -4
c = -2

Output:
Root1 = 0.80
Root2 = -0.30

Explanation:
D = (-4)² - 4(8)(-2)
D = 16 + 64 = 80

Since D > 0, two distinct real roots exist.
Roots are calculated using quadratic formula.*/

import java.util.*;
public class Root {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a, b, c:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        double D = b*b - 4*a*c;
        
        if(D > 0){
            double root1 = (-b + Math.sqrt(D)) / (2*a);
            double root2 = (-b - Math.sqrt(D)) / (2*a);
            
            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);
        }
        else if(D == 0){
            double root = (-b) / (2.0*a);
            System.out.println("Only one root = " + root);
        }
        else{
            System.out.println("Roots are imaginary");
        }
    }
}