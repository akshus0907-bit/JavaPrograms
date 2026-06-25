import java.util.*;

class FindLongestRepeatingSequQ82 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String best = "";

        for (int i = 0; i < s.length(); i++) {

            String temp = "";

            for (int j = i; j < s.length(); j++) {

                if (temp.contains("" + s.charAt(j))) {
                    break;
                }

                temp = temp + s.charAt(j);

                if (temp.length() > best.length()) {
                    best = temp;
                }
            }
        }

        System.out.println(best);
    }
}