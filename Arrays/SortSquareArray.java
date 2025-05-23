package Arrays;

import java.util.Scanner;

public class SortSquareArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sq = new int[n];
        System.out.println("Enter array element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<sq.length; i++){
            for(int j=1; j<sq.length; j++){
                if(arr[i]>arr[j]){
                    sq[i] = arr[i];
                }
            }
        }

            for(int i=0; i<sq.length; i++){
                System.out.println(sq[i]*i+" ");
            }

    }
}
