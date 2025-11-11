package Enum;

enum Status {
    Running, Failed, Pending, Successs;
}

public class Enum {
    public static void main(String a[]) {
        Status s = Status.Running;

        System.err.println(s);

        Status[] ss = Status.values();

        System.err.println(ss[0]);

        for(Status c : ss) {
            System.err.println(c);
        }
    }
}
