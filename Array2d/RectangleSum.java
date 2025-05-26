package Array2d;

import java.util.Scanner;

public class RectangleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row ans column ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter "+n*m+" element ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter r1,r2 and c1,c2");
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

        int sum = 0;
        for(int i=r1; i<=r2; i++){
            for(int j=c1; j<=c2; j++){
                sum+=arr[i][j];
            }
        }

        System.out.println("Sum is "+sum);
    }
}
