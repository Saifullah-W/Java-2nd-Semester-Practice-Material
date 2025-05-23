package Array2d;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of row1 and column1 ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("enter size of row2 and column2 ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong Input , Addition not possible! ");
            return;
        }

        int [][] arr1 = new int[r1][c1];
        int [][] arr2 = new int[r2][c2];
        int [][] sum = new int[r1][c1];

        System.out.println("Enter "+r1*c1+" element of arr1 ");
        for(int i=0;  i<r1; i++){
            for(int j=0; j<c1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter "+r2*c2+" element of arr2 ");
        for(int i=0;  i<r2; i++){
            for(int j=0; j<c2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = arr1[i][j]+arr2[i][j];
            }
        }

        }
    }

