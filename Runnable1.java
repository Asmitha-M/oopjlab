
package J1;

class MyRunnable implements Runnable{
@Override
public void run(){
try{
Thread.sleep(5);
System.out.println("Threads"+Thread.currentThread().getId()+"running");
}
catch(InterruptedException e){
    e.printStackTrace();
}
}
}
public class Runnable1 {
    public static void main(String[]args){
        MyRunnable run1=new MyRunnable();
        Thread t1=new Thread(run1);
        t1.start();
    }
}
