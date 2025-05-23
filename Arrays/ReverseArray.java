package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter array size : ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int[] ans = new int[n] ;
//        int j=0;
//        System.out.println("Enter array element ");
//        for(int i=0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
////        for(int i=arr.length-1; i>=0; i--){
////            System.out.print(arr[i] + " ");
////        }
//
//        for(int i=arr.length-1; i>=0; i--){
//            ans[j] = arr[i];
//            j++;
//        }
//       for (int i=0; i<ans.length; i++){
//           System.out.print(ans[i]+" ");
//       }

        // without using ans array
        int[] arr = {1,2,3,4,5};
        int temp = 0;
        int i=0;
        int j=arr.length-1;
        while (i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        i=0;
        while (i<arr.length){
            System.out.println(arr[i]+" ");
            i++;
        }
    }
}
