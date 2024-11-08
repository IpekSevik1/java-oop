package pack.polymorphism.ornek2;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat is meowing");
    }

    public void purr() {
        System.out.println("The cat is purring");
    }
}
