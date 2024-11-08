package pack.encapsulation.ornek1;

public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
        displayInfo();
    }

    private void displayInfo() {
        System.out.println("Car Model: " + model);
    }
}
