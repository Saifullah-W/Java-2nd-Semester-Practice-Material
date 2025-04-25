package function.thread;

class CapitalCity{
    public synchronized void  display(){
        System.out.println("Capital of Pakistan is : ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Islamabad");
        System.out.println("Capital of Iran is : ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Tehran ");
    }
}

class mythread extends Thread{

    CapitalCity cc;

    public void setvalue(CapitalCity cc){
        this.cc = cc;
    }

    public void run(){
        cc.display();
    }
}
public class demo1 {
    public static void main(String[] args) {
        CapitalCity cc = new CapitalCity();
        mythread t1 = new mythread();
        mythread t2 = new mythread();
        t1.setvalue(cc);
        t2.setvalue(cc);
        t1.start();
        t2.start();
    }

}


