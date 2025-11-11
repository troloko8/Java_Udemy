package Enum;

enum Status {
    Running, Failed, Pending, Successs;
}

public class Enum {
    public static void main(String a[]) {
        Status s = Status.Successs;

        System.err.println(s);

        Status[] ss = Status.values();

        System.err.println(ss[0]);

        for  (Status c : ss) {
            System.err.println(c);
        }
        
        System.err.println(" _ _- - _ _ - -  _ __. __ _ _ - _ - ");

        switch (s) {
            case Running:
                System.out.println("All good");
                break;
        
            case Failed:
                System.out.println("Try again");
                break;
        
            case Pending:
                System.out.println("Please wait");
                break;
        
            default:
                System.out.println("Done");
                break;
        }
    }
}
