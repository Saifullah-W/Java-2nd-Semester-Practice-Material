package Array2d;

import java.util.Scanner;

public class GenerateSpiralMatrixAnticlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of rows and column ");
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        int[][] arr = new int[r][c];
//
//        System.out.println("Enter "+r*c+" element ");
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        int toprow =0, bottomrow = r-1, leftcolumn = 0, rightcolumn = c-1;
//        int totalelement = 0;
//        while(totalelement < r * c){
//
//            // leftc --> topr- bottomr
//
//            for(int i=toprow; i<=bottomrow && totalelement < r * c; i++){
//                System.out.print(arr[i][leftcolumn]+" ");
//                totalelement++;
//            }
//            leftcolumn++;
//
//
//            // bottomrow --> leftc - rightc
//            for(int j=leftcolumn;j<=rightcolumn && totalelement < r * c; j++){
//                System.out.print(arr[bottomrow][j]+" ");
//                totalelement++;
//            }
//            bottomrow--;
//
//            // rightc --> bottomr - topr
//            for(int i=bottomrow; i>=toprow && totalelement < r * c; i--){
//                System.out.print(arr[i][rightcolumn]+" ");
//                totalelement++;
//            }
//            rightcolumn--;
//
//            // topr --> rightc - leftc
//            for(int j=rightcolumn; j>=leftcolumn && totalelement < r * c; j--){
//                System.out.print(arr[toprow][j]+" ");
//                totalelement++;
//            }
//            toprow++;

            // with n input


        System.out.println("Enter n ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int toprow = 0, bottomrow = n-1, leftcolumn = 0, rightcolumn = n-1;
        int current = 1;
        while (current<=n*n){

            // print leftcolumn
            for(int i=toprow; i<=bottomrow; i++){
                arr[i][leftcolumn] = current++;
            }
            leftcolumn++;


            // print bottomrow
            for(int j=leftcolumn; j<=rightcolumn; j++){
                arr[bottomrow][j] = current++;
            }
            bottomrow--;

            // print right column
            for(int i=bottomrow; i>=toprow; i--){
                arr[i][rightcolumn] = current++;
            }
            rightcolumn--;

            // print top row
            for(int j=rightcolumn; j>=leftcolumn; j--){
                arr[toprow][j] = current++;
            }
            toprow++;


        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
