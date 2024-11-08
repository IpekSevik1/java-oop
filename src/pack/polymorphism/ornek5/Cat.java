package pack.polymorphism.ornek5;

public class Cat extends Animal {
    public void catchRat() {
        super.move();
        this.move();
        System.out.println("Rat caught ");
    }

    @Override
    public void move() {
        System.out.println("The cat is running");
    }
}
