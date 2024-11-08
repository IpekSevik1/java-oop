package pack.finalsample.ornek1;

public class FinalSample {
    public static void add(final int number1, final int number2) {
        number1 = 5;
        System.out.println("SUM: " + (number1 + number2));
    }

    public void add2(int a, int b) {
        a = 5;
        System.out.println(a + b);
    }
}