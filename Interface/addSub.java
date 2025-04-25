package Interface;

interface Calculator{
    public void add(int a, int b);
    public void subtract(int a, int b);
    public void multiple(int a, int b);
    public void divide(int a, int b);
}

class Saif implements Calculator{
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void subtract(int a, int b){
        System.out.println(a-b);
    }
    public void multiple(int a, int b){
        System.out.println(a*b);
    }
    public void divide(int a, int b){
        System.out.println(a/b);
    }



}
public class addSub {
    public static void main(String[] args) {
        Saif saif = new Saif();
        saif.add(10,2);
        saif.subtract(10,2);
        saif.multiple(10,2);
        saif.divide(10,2);
    }

}


