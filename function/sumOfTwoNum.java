package function;

import java.util.Scanner;

public class sumOfTwoNum {
    public static void main(String[] args) {
            sum();
        System.out.println("Hello world");
        sum();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
            System.out.print("enter num1 : ");
            int num1 = sc.nextInt();
            System.out.print("enter num2 : ");
            int num2 = sc.nextInt();
            int sum = num1+num2;
        System.out.println("Sum of two number is "+sum);
    }
}
