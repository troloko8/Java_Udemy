package abstractKeywrod;

abstract class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("Play music");
    }

    public abstract void fly();
}

abstract class BuggyCar extends Car {
    public void drive() {
        System.out.println("Drive");
    }

}

class SuperBuggyCar extends BuggyCar {
    public void fly() {
        System.out.println("Flying...");
    }
}

public class Abstract {
    public static void main(String a[]) {
        Car obj = new SuperBuggyCar();

        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
