package function.thread;

import java.util.Scanner;

class T1 extends Thread{
    public void run(){
        for(int i=0; i<=1000; i++){
            if(i%2==0){
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
                System.out.println("Thread 1 is running "+i);
            }

        }
    }
}

class r1 implements Runnable{
    public int a;

    r1(int a){
        this.a = a;
    }
    public void run() {
        for (int i = 0; i < a; i++) {
            if (i % 2 != 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("User input thread " + i);
            }
        }
    }
}

public class UserThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of user thread : ");
        int a = sc.nextInt();

        T1 t1 = new T1();
        r1 r = new r1(a);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
}
