/*73. Implement your own version of `String.indexOf()`.*/
import java.util.*;

public class StrindexOfImpleQ73{

    static int indexOf(String str, String sub) {
        int n = str.length();
        int m = sub.length();

        for (int i = 0; i <= n - m; i++) {
            boolean found = true;

            for (int j = 0; j < m; j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter string:");
        String s = in.nextLine();

        System.out.println("Enter substring:");
        String sub = in.nextLine();

        int result = indexOf(s, sub);

        System.out.println("Index: " + result);
    }
}