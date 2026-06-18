 /*2. Valid Palindrome (LC 125) 
Given a string, determine whether it reads the same forward and backward after ignoring 
spaces, punctuation, and case differences. Return true if the string is a palindrome; otherwise, 
return false. 
Example: Input: "madam" → Output: true */

import java.util.*;

public class Q2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter String:");
        String s = in.nextLine();

        // string -> char array
        char ch[] = new char[s.length()];

        for(int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);

            // uppercase -> lowercase
            if(ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char)(ch[i] + 32);
            }
        }

        int start = 0;
        int end = ch.length - 1;

        boolean palindrome = true;

        while(start < end) {

            // skip special symbols and spaces from start
            while(start < end &&
                 !((ch[start] >= 'a' && ch[start] <= 'z') ||
                   (ch[start] >= '0' && ch[start] <= '9'))) {
                start++;
            }

            // skip special symbols and spaces from end
            while(start < end &&
                 !((ch[end] >= 'a' && ch[end] <= 'z') ||
                   (ch[end] >= '0' && ch[end] <= '9'))) {
                end--;
            }

            // compare characters
            if(ch[start] != ch[end]) {
                palindrome = false;
                break;
            }

            start++;
            end--;
        }

        if(palindrome) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}