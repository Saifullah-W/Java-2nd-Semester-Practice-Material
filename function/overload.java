package function;

class  A{
//    int a = 10;
//    void display(){
//        System.out.println(a);
//    }
    A(int a){
        System.out.println("Class a");
    }

}

class B extends A{
//    int a = 20;
//    void value(){
//        super.display();
//       System.out.println(super.a);
//        System.out.println(a);
//    }

    B(){
        super(20);
        System.out.println("Class b");
    }
}
public class overload {
//    public static void addition(int a, int b){
//        System.out.println(a+b);
//    }
//
//    public static void addition(float a, int b){
//        System.out.println(a+b);
//    }
//
//    public static void addition(int a, float b){
//        System.out.println(a+b);
//    }
//
//    public static void addition(float a, float b){
//        System.out.println(a+b);
//    }

    public static void main(String[] args) {
//        addition(3.5f,5);
//    B b = new B();
//    b.display();
//    b.value();
//        System.out.println(new B().a);
new B();
    }
}
