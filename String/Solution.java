import java.util.Scanner;

class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary string:");
        String s = sc.nextLine();

        int count = 0;
        int previous = 0;
        int current = 1;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                current++;
            } 
            else {
                count = count + Math.min(previous, current);

                previous = current;
                current = 1;
            }
        }

        count = count + Math.min(previous, current);

        System.out.println("Count of Binary Substrings: " + count);

        sc.close();
    }
}