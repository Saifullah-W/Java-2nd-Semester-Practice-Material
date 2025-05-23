package function.thread;

class thread extends Thread{
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("Child thread"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class practicePaper {
    public static void main(String[] args) {
        thread t1 = new thread();
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e){
            e.getMessage();
        }

        System.out.println("Main is run after child thread is complete");
    }
}