package LabTasks;
import java.util.ArrayList;

public class UsePreBuildFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.remove(2);
        arr.addFirst(5);
        arr.addLast(70);


        System.out.println("first num is "+arr.get(1));
        System.out.println(arr);
        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());


        System.out.println( arr.reversed());

    }

}
