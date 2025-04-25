package function.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number 1 : ");
            int a = sc.nextInt();
            System.out.print("Enter number 2 : ");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("a/b = "+c);
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by zero");
        }
        catch (InputMismatchException e){
            System.out.println("You can't divide any character by number ! ");
        }
    }
}
