package Array2d;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of rows and column ");
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        int[][] arr = new int[r][c];
//        int[][] transpose = new int[c][r];
//
//        System.out.println("Enter "+r*c+" element ");
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++){
//               transpose[j][i] =   arr[i][j] ;
//            }
//        }
//
//        for(int i=0; i<c; i++){
//            for(int j=0; j<r; j++){
//                System.out.print(transpose[i][j]+" ");
//            }
//            System.out.println();

            // without new array

        System.out.println("Enter size of rows and column ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter "+r*c+" element ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
