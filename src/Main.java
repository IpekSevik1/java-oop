import pack.finalsample.ornek1.FinalSample;
import pack.interfacee.Animal;
import pack.interfacee.Cat;
import pack.interfacee.Dog;
import pack.staticsample.BankAccount;
import pack.staticsample.Employee;

import static pack.staticsample.BankAccount.calculateInterest;

public class Main {
    public static void main(String[] args) {

    }
}




        /*
        //STATIC ORNEK1
        double deposit = 1000.00;
        double interest = BankAccount.calculateInterest(deposit);
        System.out.println("Principal: " + deposit + " TL, Interest: " + interest + " TL");

        //STATIC ORNEK2
        System.out.println(Employee.increaseTheNumber());
        System.out.println(Employee.increaseTheNumber());
        System.out.println(Employee.increaseTheNumber());

        //ABSTRACT CLASS ORNEK1
        Animal dog = new Dog();
        Animal cat = new Cat();
        cat.eat();
        dog.eat();
        cat.makeSound();
        dog.makeSound();

        //GETTER SETTER ORNEK1
        Car car = new Car("Toyota");

        //GETTER SETTER ORNEK2
        Student student = new Student();
        student.setName("Ipek");
        student.setAge(100);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        //CONSTRUCTOR ORNEK1
        public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.3, 6.5);


        //CONSTRUCTOR ORNEK2
        Dog dog = new Dog("Poyraz", "Golden Retriever");
        dog.display();


        //POLIMORPHISM ORNEK1
        Cat cat = new Cat();
        Cow cow = new Cow();
        cat.makeSound();
        cow.makeSound();


        //POLIMORPHISM ORNEK2
        Cat cat = new Cat();
        cat.move();
        cat.makeSound();
        cat.purr();

        Animal cat1 = new Cat();
        cat1.move();
        cat1.makeSound();

        Animal cow = new Cow();
        cow.move();
        cow.makeSound();


        //POLIMORPHISM ORNEK3
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.add(5, 50));
        System.out.println(mathematics.add(7.4, ,4.5));
        System.out.println(mathematics.add(8, 6, 30));


        //POLIMORPHISM ORNEK4
        Dog dog = new Dog();
        dog.makeSound();
        dog.printName();


        //POLIMORPHISM ORNEK5
        Cat cat = new Cat();
        cat.catchRat();


        */

        /*
        //INHERITANCE ORNEK1
        ToplaOynananSporDallari toplaOynananSporDallari = new ToplaOynananSporDallari();
        toplaOynananSporDallari.topaVur();

        Futbol futbol = new Futbol();
        futbol.topaVur();
        futbol.sutCek();


        //INHERITANCE ORNEK2
        Aydinlatma aydinlatma = new Aydinlatma();
        aydinlatma.sistemUrunSayisi = 10;
        aydinlatma.garantiSuresi = 2;
        aydinlatma.sistemiAc();
        aydinlatma.isiklariAc();
        aydinlatma.isiklariKapat();
        aydinlatma.sistemiKapat();
        System.out.println("Aydınlatma urun sayisi: " + aydinlatma.sistemUrunSayisi);
        System.out.println("Aydinlatma garanti suresi: " + aydinlatma.garantiSuresi);

        RenkliLamba renkliLamba = new RenkliLamba();
        renkliLamba.garantiSuresi = 1;
        renkliLamba.sistemUrunSayisi = 5;
        renkliLamba.sistemiAc();
        renkliLamba.isiklariAc();
        renkliLamba.renkDegistir();
        renkliLamba.isiklariKapat();
        renkliLamba.sistemiKapat();
        System.out.println("Renkli lamba urun sayisi: " + renkliLamba.sistemUrunSayisi);
        System.out.println("Renkli lamba garanti suresi: " + renkliLamba.garantiSuresi);


        //INHERITANCE ORNEK3
        Kopek kopek = new Kopek();
        System.out.println(kopek instanceof Kopek);


        //INHERITANCE ORNEK4
        Meyve cilek = new Cilek();
        Meyve meyve = new Meyve();

        meyveIslemiYap(cilek);
        meyveIslemiYap(meyve);
    }


         //INHERITANCE ORNEK4
    public static void meyveIslemiYap(Meyve meyve) {
        if (meyve instanceof Cilek) {
            ((Cilek) meyve).tatTestiYap();
        } else if (meyve instanceof Elma) {
            ((Elma) meyve).meyveSoy();
        } else if (meyve instanceof Mandalina) {
            ((Mandalina) meyve).meyveSuyuYap();
        } else {
            meyve.meyveYe();
        }
    }

         */
