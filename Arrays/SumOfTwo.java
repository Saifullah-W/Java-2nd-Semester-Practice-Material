package Arrays;
import java.util.Scanner;
// two indices
//public class SumOfTwo {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        int target = 7;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    System.out.println(i + " " + j);
//                }
//            }
//        }
//    }
//}

public class SumOfTwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array element ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target : ");
        int target = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k] == target) {
                    System.out.println("Index where target is found is [" + i + " " + j + " "+k+"]");
                    }
                }
            }
        }
    }
}