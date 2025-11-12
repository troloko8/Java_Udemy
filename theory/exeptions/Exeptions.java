package exeptions;

// exeptions are run time error
public class Exeptions {
    public static void main(String a[]) {
        int i = 8;
        int j = 0;

        try {
            j = 18/0;
        } catch (Exception e) {
            System.err.println("went wrong");
        }

        System.out.println("j: " + j);

        System.out.println("Buy: " + j) ;
    }
}
