/*81. Generate all possible strings from a set of characters.*/
import java.util.*;

public class GenerateStrQ81 {
	static void generate(String str, String ans, int index) {
        if (index == str.length()) {
            if (!ans.isEmpty()) {
                System.out.println(ans);
            }
            return;
        }
        generate(str, ans + str.charAt(index), index + 1);

        generate(str, ans, index + 1);
    }
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter characters: ");
        String str = in.next();

        System.out.println("\nPossible Strings:");

        generate(str, "", 0);
    }
}