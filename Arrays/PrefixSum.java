package Arrays;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter array size : ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int[] prefix = new int[n];
//        System.out.println("Enter array element ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        prefix[0] = arr[0];
//        for(int i=1; i<arr.length; i++){
//            prefix[i] = prefix[i-1]+arr[i];
//        }
//        for(int i=0; i<arr.length; i++){
//            System.out.print(prefix[i]+" ");
//        }

        // without new array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1];
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
