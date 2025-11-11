package Enum;

enum Status {
    Running, Failed, Pending, Successs;
}

enum Laptop {
    Macbook(2000), XPS, Surface(1800), ThinkPad(2200);

    private int price;

    Laptop() {
        price = 199;
    }

    Laptop(int price) {
        this.price = price;

        System.err.println("in Laprop : " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enum {
    public static void main(String a[]) {

        // Laptop lap = Laptop.Macbook;

        // System.err.println(lap.getPrice());

        for(Laptop aLap : Laptop.values()) {
            System.err.println(aLap  + " : " + aLap.getPrice());
        }

        // OLDone basic
        // Status s = Status.Successs;

        // int numOfS = s.ordinal();

        // System.err.println(s);
        // System.err.println("numOfS : " + numOfS);

        // Status[] ss = Status.values();

        // System.err.println(ss[0]);

        // for  (Status c : ss) {
        //     System.err.println(c);
        // }
        
        // System.err.println(" _ _- - _ _ - -  _ __. __ _ _ - _ - ");

        // switch (s) {
        //     case Running:
        //         System.out.println("All good");
        //         break;
        
        //     case Failed:
        //         System.out.println("Try again");
        //         break;
        
        //     case Pending:
        //         System.out.println("Please wait");
        //         break;
        
        //     default:
        //         System.out.println("Done");
        //         break;
        // }

        // System.err.println("Is Enum a class: " + s.getClass().getSuperclass());
    }
}
