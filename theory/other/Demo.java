
public class Demo {
    public static void main(String a[]) 
    {
        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int)(Math.random() * 100);

                // System.err.println(nums[i][j] + ' ');
                System.err.print(nums[i][j] + " ");
                System.err.print(Math.random());
            }

                System.err.println();
        }

        for (int i = 0; i < 3; i++) {

            // for (int j = 0; j < 4; j++) {
            //     nums[i][j] = (int) (Math.random() * 100);

            //     System.err.print(nums[i][j]);
            // }
        }
    }
}
