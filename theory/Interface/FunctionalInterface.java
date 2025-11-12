package Interface;

// @FunctionalInterface
interface A {
    // void show(int i);
    int show(int i, int j);
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

        // A obj = i -> System.err.println("In show " + i);
        A obj = (i, j) -> i + j;

        obj.show(109, 108);
        System.err.println(obj.show(109, -108));
    }
}
