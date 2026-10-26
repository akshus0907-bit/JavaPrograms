//find max
import java.util.*;

public class FindMax{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(25);
        list.add(10);
        list.add(50);
        list.add(15);
        list.add(40);

        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println("List: " + list);
        System.out.println("Largest Number: " + max);
    }
}
