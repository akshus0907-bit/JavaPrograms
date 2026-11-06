class ExceptionInsideCatch {
    public static void main(String[] args) {

        try {

            try {
                int a = 10 / 0;
            }
            catch (ArithmeticException e) {

                System.out.println("Inner catch executed");

                int b = 20 / 0;
            }

        }
        catch (ArithmeticException e) {

            System.out.println("Outer catch handled the exception");
        }

        System.out.println("Main method completed");
    }
}