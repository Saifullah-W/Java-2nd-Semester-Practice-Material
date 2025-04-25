package function.thread;

public class MyThread extends Thread {
    public void run(){
        System.out.println("Thread 1 running ");
        for(int i=0; i<=10; i++){
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
