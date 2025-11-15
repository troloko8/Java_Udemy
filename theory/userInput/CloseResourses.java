package userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CloseResourses {
    public static void main(String[] args) throws IOException {
        int num = 0;
        // BufferedReader bf = null;

        // // Deafault solution
        // try {
        //     InputStreamReader in = new InputStreamReader(System.in);
        //     ;
        //     num = Integer.parseInt(bf.readLine());

        //     System.err.println(num);
        // } finally {
        //     bf.close();
        // }

        // Elegant one solution 
        // in this case bf.close() calls automaticly
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(bf.readLine());

            System.err.println(num);
        }

    }
}
