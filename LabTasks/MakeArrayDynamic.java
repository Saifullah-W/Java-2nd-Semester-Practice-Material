package LabTasks;

public class MakeArrayDynamic {

    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray(2); // Initialize with size 2 for demonstration
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.display();
    }
}
class DynamicArray{
    private int count = 0;
    private int size = 0;
    private int arr[];

    DynamicArray(int size){
        this.size = size;
        arr = new int[size];
    }

    public void display(){
        for(int a:arr){
            System.out.println(a);
        }
    }

    public void isFull(){
        if(count == size){
            System.out.println("Array is full , now it will be resized !");
            arr = makedynamic();
        }
    }

        int[] makedynamic(){
            int origsize = size;
            size = size*2;
            int[] dummy = new int[size];
            for(int i=0; i<origsize; i++){
                dummy[i] = arr[i];
            }
            return dummy;
        }

        public void add(int val){
        isFull();
        arr[count] = val;
        count++;
        }

        public void update(int index, int value){

        }

}