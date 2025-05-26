package Array2d;

import java.util.Scanner;

public class RotateArray {
    static void swap(int[][] arr){
        int i=0,j=arr.length-1;
        while (i < j){
            int[] temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of rows and column ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        if(r!=c){
            System.out.println("Matrix must be square matrix ! ");
            return;
        }
        int[][] arr = new int[r][c];

        System.out.println("Enter "+r*c+" element ");
        for(int i=0; i<r; i++){
            for(int j=0; j<r; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<r; i++){
            for(int j=i+1; j<r; j++){
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i] = temp;
            }
        }

        swap(arr);

        for(int i=0; i<r; i++){
            for(int j=0; j<r; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
