package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of array: ");
//        int n = sc.nextInt();
//
//
//        int[] arr = new int[n];
//        System.out.println("Enter Array element ");
//        for(int i=0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.print("Enter Target K : ");
//        int k = sc.nextInt();
//        k = k%n;
//        int[] ans = new int[n];
//        int j=0;
//
//        for(int i=n-k; i<arr.length; i++){
//            ans[j++] = arr[i];
//        }
//
//        for(int i=0; i<n-k; i++){
//            ans[j++] = arr[i];
//        }
//
//        for(int i=0; i<arr.length; i++){
//            System.out.print(ans[i]+" ");
//        }

        // Reverse without ans array

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();


        int[] arr = new int[n];
        System.out.println("Enter Array element ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Target K : ");
        int k = sc.nextInt();
        k = k%n;

        reverse(arr,0,arr.length-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,k-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void reverse(int[] arr , int start, int end){
        while (start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
