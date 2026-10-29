import java.util.*;

class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println("TreeSet: " + set);

        System.out.println("First Element: " + set.first());
        System.out.println("Last Element: " + set.last());

        System.out.println("Higher than 30: " + set.higher(30));
        System.out.println("Lower than 30: " + set.lower(30));
    }
}