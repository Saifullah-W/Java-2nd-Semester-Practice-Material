package function.ExceptionHandling;


public class ThrowThrows {
    public static void maths (int i)throws ArithmeticException, ArrayIndexOutOfBoundsException {
        try {
            if (i == 1) {
                System.out.println("this method throw arithmetic exception");

            throw new ArithmeticException();}
            if (i == 2) {
                System.out.println("this method throw Array index out of bound");

            throw new ArrayIndexOutOfBoundsException();}
        }
        finally {
            System.out.println("this block will always run");
        }
    }

    public static void main(String[] args) {
        try{
            maths(1);
        }
        catch (ArithmeticException e){
            e.fillInStackTrace();
        }
        try{
            maths(2);
            }
        catch (ArrayIndexOutOfBoundsException e){
           e.fillInStackTrace();
        }
        }
    }

