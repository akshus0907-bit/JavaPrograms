/*Question 43: Mobile plan billing system:
? Input: Minutes used in a month
? Logic:
? Up to 100 mins ? Base ?199
? 101–300 mins ? ?199 + ?1/min for extra
? 301–500 mins ? ?199 + ?1.5/min for extra
? Above 500 mins ? ?199 + ?2/min for extra
? Output: Total monthly bill.
Input
Minutes Used = 350

Logic
Up to 100 mins ? ?199

101–300 mins ? ?199 + ?1 per extra minute

301–500 mins ? ?199 + ?1.5 per extra minute

Above 500 mins ? ?199 + ?2 per extra minute

Output
Total Bill = ?574

Explanation
Extra minutes = 350 ? 100 = 250
Since usage is in 301–500 range:
Extra charge = 350 × 1.5 = 375
Total Bill = 199 + 375 = 574*/
import java.util.*;

public class Mobile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter minutes used:");
        double min = in.nextDouble();
        
        double basePrice = 199;
        double totalBill = 0;

        if (min < 0) {
            System.out.println("Invalid input");
        } else if (min <= 100) {
            totalBill = basePrice;
        } else if (min <= 300) {
            // 101-300 mins: 199 + 1/min for extra
            totalBill = basePrice + (min - 100) * 1.0;
        } else if (min <= 500) {
            // 301-500 mins: 199 + 1.5/min for extra
            totalBill = basePrice + (min - 100) * 1.5;
        } else {
            // Above 500 mins: 199 + 2/min for extra
            totalBill = basePrice + (min - 100) * 2.0;
        }

        if (min >= 0) {
            System.out.println("Total Bill = " + totalBill);
        }
    }
}
