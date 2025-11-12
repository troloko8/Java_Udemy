package exeptions;

// exeptions are run time error
public class Exeptions {
    public static void main(String a[]) {
        int i = 8;
        int j = 0;

        int[] arr = new int[5];
        String str = null;

        try {
            j = 18/2;
            System.err.println(arr[5]);
            System.err.println(str.length());
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by 0 " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("This element not exist " + e);
        } catch (Exception e) {
            System.err.println("went wrong " + e);
        }

        System.out.println("j: " + j);

        System.out.println("Buy: " + j) ;
    }
}
