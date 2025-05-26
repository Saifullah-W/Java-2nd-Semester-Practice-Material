package Array2d;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int r= sc.nextInt();
        int[][] arr = new int[r][];
        for(int i=0; i<r; i++){
            arr[i] = new int[i+1];
            arr[i][0] = arr[i][i] = 1;
            for(int j=1; j<i; j++){
                arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
