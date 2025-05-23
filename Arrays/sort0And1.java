package Arrays;

import java.util.Scanner;

public class sort0And1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter array size : ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter array element 0 and 1 ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int choice = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                choice++;
//            }
//        }
//        for (int i=0; i<arr.length; i++){
//            if(i<choice){
//                arr[i] = 0;
//            }
//            else
//                arr[i] = 1;
//        }
//
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i] + " ");
//        }


        // sort without choice
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element 0 and 1 ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0 ;
        int right = arr.length-1;
        while (left<right){
            if(arr[left] == 0){
                left++;
            }
            else if(arr[right]==1){
                right--;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
