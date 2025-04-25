package function.ExceptionHandling;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        int a[] = new int[10];
        for(int i=-1; i<10; i++) {
            try {
                int k;
                k = i / (9 - i);
                a[i] = i;
                System.out.println("a[" + i + "] = " + a[i] + ", k = " + k);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bound");
            }
            catch (ArithmeticException e){
                System.out.println("can't divide by zero !");
            }
            catch (ArrayStoreException e){
                System.out.println("Array store exception ");
            }
            catch (Exception e){
                System.out.println("Invalid exception");
            }
        }

    }
}
