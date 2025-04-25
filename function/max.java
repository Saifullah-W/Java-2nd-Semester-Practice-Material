package function;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter element of array");
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i=0; i<a; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int smax = arr[0];
        for(int i=0; i<a; i++){
            if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        System.out.println("largest no is :"+ max);
        System.out.print("Second largest no is :"+ smax);
    }
}
