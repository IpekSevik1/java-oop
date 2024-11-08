package pack.polymorphism.ornek4;

public class Dog extends Animal {
    String name = "Dog";

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Bark bark");
    }

    @Override
    public void printName() {
        System.out.println(name);
        System.out.println(super.name);
    }
}
