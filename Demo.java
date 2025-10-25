
class Calculator
{

    int a;

    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}

public class Demo {
    public static void main(String a[]) 
    {
        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator();

        int res = calc.add(num1, num2);

        int nums[] = {1,2,3,4};

        System.out.println(nums[0]);
    }
}
