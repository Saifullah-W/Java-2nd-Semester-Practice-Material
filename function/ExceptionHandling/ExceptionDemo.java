package function.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter denomenator: ");
        int b = sc.nextInt();

            int c = a / b;
            System.out.println(c);
        }
         catch (InputMismatchException e){
            System.out.println("Input mismatch exception!");
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic exception!");
        }
        System.out.println("Hello world");
    }
}
