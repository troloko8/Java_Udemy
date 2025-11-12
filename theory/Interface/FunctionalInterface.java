package Interface;

// @FunctionalInterface
interface A {
    void show(int i);
}

// class B implements A {
//     public void show() {
//         System.err.println("In show");
//     }
// }

public class FunctionalInterface {
    public static void main(String a[]) {
        // A obj = new B()
        // A obj = new A(){
        //     public void show() {
        //         System.err.println("In show");
        //     }
        // };

        // Lambda expression

        A obj = i -> System.err.println("In show " + i);

        obj.show(109);
    }
}
