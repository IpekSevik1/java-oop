package pack.staticsample;

public class Employee {
    public String employeeName;
    public static int numberOfEmployees = 0;

    public static int increaseTheNumber() {
        numberOfEmployees = numberOfEmployees + 1;
        return numberOfEmployees;
    }
}
