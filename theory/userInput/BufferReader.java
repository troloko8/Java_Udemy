package userInput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReader {
    public static void main(String[] args) {
        System.err.println("------enter input _------");

        // A OLD ONE SOLUTION
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // A NEW ONE SOLUTION
        Scanner sc = new Scanner(System.in);
        int num = 0;

        try {
            // num = Integer.parseInt(bf.readLine());
            num = sc.nextInt();
        } catch (Exception e) {
        }

        System.err.println(num);

    }
}
