package function.thread;

public class MainThread {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyRunnable r1 = new MyRunnable();
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();

    }
}
