package function.ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.nio.Buffer;

public class checkedException {
    public static void main(String[] args) {
        int i, k = 0, a[], b[];
        String S = " ";
        System.out.println("Enter any number from 1 to 4");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            S = br.readLine();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        i = Integer.parseUnsignedInt(S);

        try {
            if (i == 1) {
                k = i / (i - 1);
            }
            if (i == 2) {
                a = new int[i-3];
            }
            if (i == 3) {
                i = i / (i - 3);
            }
            if (i == 4) {
                b = new int[1];
                b[1] = 500;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        } catch (ArithmeticException e){
            System.out.println("can't divide by a negative num");
        } catch (NegativeArraySizeException e){
            System.out.println("negative array");
        } catch (Exception e){
            System.out.println("chose  write number ");
        } finally {
            System.out.println("Program executed");
        }


        System.out.println("Hello world");

    }
}
