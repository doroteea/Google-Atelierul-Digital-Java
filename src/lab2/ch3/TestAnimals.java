package lab2.ch3;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.walk();
        d.eat();

        System.out.println(c.getName());
        c.eat();

        e.walk();
        p.play();


    }
}
