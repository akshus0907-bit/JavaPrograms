/*84. Find the longest common substring of two strings.*/
import java.util.*;

public class LongestCommonSubStrQ84 {

    public static void main(String[] args) {

        String s1 = "abcdef";
        String s2 = "zcdemf";

        String longest = "";

        for(int i = 0; i < s1.length(); i++) {

            for(int j = i + 1; j <= s1.length(); j++) {

                String sub = s1.substring(i, j);

                if(s2.contains(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        System.out.println("Longest Common Substring: " + longest);
    }
}