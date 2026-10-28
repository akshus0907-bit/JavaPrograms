
import java.util.Scanner;

public class FrequenceChar
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i++)
        {
            boolean checked = false;

            for(int k = 0; k < i; k++)
            {
                if(s.charAt(k) == s.charAt(i))
                    checked = true;
            }

            if(!checked)
            {
                int count = 0;

                for(int j = 0; j < s.length(); j++)
                {
                    if(s.charAt(i) == s.charAt(j))
                        count++;
                }

                System.out.println(s.charAt(i) + " = " + count);
            }
        }
    }
}
