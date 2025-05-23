package Array2d;

public class Array2d {
    public static void main(String[] args) {
        int [][] arr = { {1,2,3,10},{4,5,6,11},{7,8,9,12} };
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
