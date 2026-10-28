
import java.util.Scanner;

public class ReverseEachWord
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String s = sc.nextLine();

        String word = "";
        String result = "";

        for(int i = 0; i <= s.length(); i++)
        {
            if(i < s.length() && s.charAt(i) != ' ')
            {
                word = word + s.charAt(i);
            }
            else
            {
                for(int j = word.length() - 1; j >= 0; j--)
                {
                    result = result + word.charAt(j);
                }

                if(i < s.length())
                    result = result + " ";

                word = "";
            }
        }

        System.out.println(result);
    }
}
