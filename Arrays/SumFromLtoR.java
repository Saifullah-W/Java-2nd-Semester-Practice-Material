package Arrays;

import java.util.Scanner;

public class SumFromLtoR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element ");
        for (int i = 1; i <= arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter first val L ");
        int l = sc.nextInt();
        System.out.println("Enter last val R ");
        int r = sc.nextInt();

        int sum = 0;
        for(int i=l; i<=r; i++){
                sum+=arr[i];
        }

        for(int i=1; i<=arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
