package Array2d;

import java.util.Scanner;

public class GenerateSpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int toprow = 0, bottomrow = n-1, leftcolumn = 0, rightcolumn = n-1;
        int current = 1;
        while (current<=n*n){
                // print toprow
            for(int j=leftcolumn; j<=rightcolumn; j++){
                arr[toprow][j] = current++;
            }
            toprow++;

            // print right column
            for(int i=toprow; i<=bottomrow; i++){
                arr[i][rightcolumn] = current++;
            }
            rightcolumn--;

            // print bottom row
            for(int j=rightcolumn; j>=leftcolumn; j--){
                arr[bottomrow][j] = current++;
            }
            bottomrow--;

            // print left column
            for(int i=bottomrow; i>=toprow; i--){
                arr[i][leftcolumn] = current++;
            }
            leftcolumn++;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
