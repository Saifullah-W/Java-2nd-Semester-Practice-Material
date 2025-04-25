package function.thread;

public class MyRunnable implements Runnable {
    public void run(){
        System.out.println("Thread is running ");
        for(int i=0; i<=10; i++){
            if(i%2!=0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Thread 2 is running " + i);
            }
        }
    }
}
