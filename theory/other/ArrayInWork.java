
public class ArrayInWork {
    public static void main(String a[]) 
    {
        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int)(Math.random() * 100);

                // System.err.println(nums[i][j] + ' ');
                System.err.print(nums[i][j] + " ");
            }

                System.err.println();
        }

            System.err.println();
            System.err.println();

        for (int n[] : nums) {
            System.err.println(n[0]);
            
            for (int m : n) {
                System.err.print(m + " ");
            }

            System.err.println();
        }
    }
}
