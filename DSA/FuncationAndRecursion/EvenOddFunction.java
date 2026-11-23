
public class EvenOddFunction {

    static void checkEvenOdd(int n) {

        if(n % 2 == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {

        checkEvenOdd(10);
        checkEvenOdd(7);
    }
}
