package function.ExceptionHandling;

public class labEg {
  static void display() throws ArithmeticException{
      throw new ArithmeticException("hello");
//        System.out.println(2/0);
    }

    public static void main(String[] args) {
        display();
//        try {
//            display();
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
//            System.err.println("Araay ");}
////            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("i always run");
//        }
        System.out.println("Hello world");
    }
}