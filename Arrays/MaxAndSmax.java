package Arrays;

import java.util.Scanner;

class Max {
    int findMax(int[] arr){
       int max = Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++){
           if(arr[i]>max){
               max = arr[i];
           }
       }
       return max;
    }

    int FindSmax(int[] arr){
        int max = findMax(arr);
        int smax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        return smax;
    }
}

public class MaxAndSmax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array element ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Max m = new Max();
        System.out.println("Max is "+m.findMax(arr));
        System.out.println("Smax is "+m.FindSmax(arr));
    }
}
