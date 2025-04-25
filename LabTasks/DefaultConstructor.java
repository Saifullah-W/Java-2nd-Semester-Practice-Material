package LabTasks;

class demo{
    int a;
    int b;
    demo(int a,int b){
        this.a = a;
        this.b = b;

    }

    void addition(){
        System.out.println(a+b);
    }

    void addition(int a, int b){
        System.out.println(a+b);
    }

}
public class DefaultConstructor {
    public static void main(String[] args) {
        demo d1 = new demo(3,5);
        d1.addition(45,7);
        d1.addition();
    }
}

