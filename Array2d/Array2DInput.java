package Array2d;

import java.util.Scanner;

public class Array2DInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of row and column ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr = new int[r][c];
        System.out.println("Enter element of rows and column ");
        for(int i=0; i< r; i++){
            for(int j=0; j< c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
