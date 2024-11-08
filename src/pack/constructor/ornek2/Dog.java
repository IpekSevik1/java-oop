package pack.constructor.ornek2;

public class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}