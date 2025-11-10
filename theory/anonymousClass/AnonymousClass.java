package anonymousClass;


class A {
    int age = 10;

    public void show() {
        System.err.println("in show A");
    }
}

public class AnonymousClass {
    public static void main(String a[]) {
        A obj = new A(){
            public void show() {
                System.err.println("In anonmous ");
            }
        };

        obj.show();
    }
}
