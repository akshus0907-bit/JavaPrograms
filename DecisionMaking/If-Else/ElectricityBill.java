/*Question 29: Write a java program to input electricity unit charges & calculate total electricity bill according to the given condition
                For first 50 units Rs. 0.50/unit
                For next 100 units Rs. 0.75/unit
                For next 150 units Rs. 1.20/unit
                For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill
Input:
Units = 300

Output:
Total Electricity Bill = Calculated Amount

Explanation:
First 50 units ? 50 × 0.50
Next 100 units ? 100 × 0.75
Next 150 units ? 150 × 1.20
Remaining units ? 50 × 1.50
Total amount is calculated and then 20% surcharge is added.*/
import java.util.*;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter units:");
        double units = in.nextDouble();
        double amount = 0;

        if (units <= 50) {
            amount = units * 0.50;
        } 
        else if (units <= 150) { // पुढचे 100 युनिट्स (50 + 100 = 150 पर्यंत)
            amount = (50 * 0.50) + ((units - 50) * 0.75);
        } 
        else if (units <= 250) { // पुढचे 150 युनिट्स (150 + 100 = 250 पर्यंत)
            amount = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20);
        } 
        else { // 250 च्या वरती
            amount = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
        }

        // 20% जादा सरचार्ज (Surcharge) जोडणे
        double surcharge = amount * 0.20;
        double totalBill = amount + surcharge;

        System.out.println("Total Electricity Bill = " + totalBill);
    }
}
