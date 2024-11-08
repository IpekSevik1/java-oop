package pack.staticsample;

public class BankAccount {
    private static double interestRate = 0.05;

    public static double calculateInterest(double amount) {
        return amount * interestRate;
    }
}
