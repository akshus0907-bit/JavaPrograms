import java.util.Scanner;

public class ArmstrongNumber {
 
    public static int countDigits(int n) {
        if(n == 0)
            return 0;
        return 1 + countDigits(n / 10);
    }
    // 2. Function to calculate power - recursive
    public static int power(int base, int exp) {
        if(exp == 0)
            return 1;
        return base * power(base, exp - 1);
    }
    
    // 3. Function to calculate Armstrong sum - recursive
    public static int armstrongSum(int n, int digits) {
        if(n == 0)
            return 0;
        int digit = n % 10;
        return power(digit, digits) + armstrongSum(n / 10, digits);
    }
     // 4. Check Armstrong
    public static boolean isArmstrong(int n) {
        int digits = countDigits(n);
        int sum = armstrongSum(n, digits);
        return sum == n;
    }
    
    // 5. Function to get sum of squares of digits - recursive
    public static int sumOfSquares(int n) {
        if(n == 0)
            return 0;
        int digit = n % 10;
        return (digit * digit) + sumOfSquares(n / 10);
    }
    
    // 6. Check Happy Number - recursive with cycle detection
    public static boolean isHappy(int n) {
        return isHappyHelper(n, n);
    }
    
    // Helper: Floyd's cycle detection using recursion
    public static boolean isHappyHelper(int slow, int fast) {
        slow = sumOfSquares(slow);
        fast = sumOfSquares(sumOfSquares(fast));
        
        if(fast == 1)
            return true;
        if(slow == fast)
            return false;
        return isHappyHelper(slow, fast);
    }
    
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // Check Armstrong
        if(isArmstrong(num))
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is NOT an Armstrong number");
        
       
        if(isHappy(num))
            System.out.println(num + " is a Happy number");
        else
            System.out.println(num + " is NOT a Happy number");
        
    }
}