import java.util.Scanner;

class LongestUniqueSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = sc.nextLine();

        int maxLength = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            String temp = "";

            for (int j = i; j < str.length(); j++) {

                char ch = str.charAt(j);

                if (temp.indexOf(ch) != -1) {
                    break;
                }

                temp = temp + ch;

                if (temp.length() > maxLength) {
                    maxLength = temp.length();
                    result = temp;
                }
            }
        }

        System.out.println("Longest Substring: " + result);
        System.out.println("Maximum Length: " + maxLength);

        sc.close();
    }
}