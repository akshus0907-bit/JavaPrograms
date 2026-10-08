/*Question 3 — Find Duplicate Characters

Input: programming

Output:
r
g
m

Try solving using:
charAt()
indexOf()
lastIndexOf()
loops*/
import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter string");
        String str = in.nextLine();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(str.indexOf(ch) != str.lastIndexOf(ch)) {
                System.out.println(ch);
            }
        }
    }
}