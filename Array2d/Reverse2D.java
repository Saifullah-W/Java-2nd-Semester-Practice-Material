package Array2d;

import java.util.Scanner;

public class Reverse2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of rows and column ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int[][] ans = new int[r][c];

        System.out.println("Enter "+r*c+" element ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=r-1; i>=0; i--){
            for(int j=c-1; j>=0; j--){
                ans[i][j] = arr[i][j];
            }
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
