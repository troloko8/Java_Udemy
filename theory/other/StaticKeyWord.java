
class Mobile {

    String brand;
    int price;
    static String name; // static means that this variable is shared and belong not to created object intance but to this class

    // implementation of constructor concept
    public Mobile() 
    {
        brand = "";
        price = 200;

        System.err.println("constructor BLOCK");
    }

    // block for initialization only static variables, it calls only once
    static
    {
        name = "Phone";

        System.err.println("static BLOCK");
    }
    
    public void show() 
    {
        System.err.println(brand + " : " + price + " : " + name);

    }

    // common to all obj and in static methods you can use just static vars
    public static void staticShow(Mobile mob) 
    {
        System.err.println(mob.brand + " : " + mob.price + " : " + mob.name);
    }
}

public class StaticKeyWord {
    public static void main(String a[]) throws ClassNotFoundException 
    {

        Class.forName("Mobile"); // in order to if we want to instantiate the class without creating obj instance (it will load a class)

        Mobile obj1 = new Mobile();

        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone"; // as a static var this value become common to all obj examples

        // obj1.show();

        // Mobile.staticShow((obj1));

        Mobile obj2 = new Mobile();
    }
}
