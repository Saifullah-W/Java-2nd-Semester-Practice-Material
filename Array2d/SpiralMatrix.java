package Array2d;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        int toprow =0, bottomrow = r-1, leftcolumn = 0, rightcolumn = c-1;
        int totalelement = 0;
        while(totalelement < r * c){
            // toprow --> leftc - rightc
            for(int j=leftcolumn;j<=rightcolumn; j++){
                System.out.print(arr[toprow][j]+" ");
                totalelement++;
            }
            toprow++;

            // Rightc --> topr- bottomr

            for(int i=toprow; i<=bottomrow; i++){
                System.out.print(arr[i][rightcolumn]+" ");
                totalelement++;
            }
            rightcolumn--;

            // bottomr --> rightc - leftc
            for(int j=rightcolumn; j>=leftcolumn; j--){
                System.out.print(arr[bottomrow][j]+" ");
                totalelement++;
            }
            bottomrow--;

            // leftc --> bottomr - topr
            for(int i=bottomrow; i>=toprow; i--){
                System.out.print(arr[i][leftcolumn]+" ");
                totalelement++;
            }
            leftcolumn++;
        }
    }
}
