
package J1;

class Mythread extends Thread{
    public Mythread(String name){
        super(name);
       
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("thread"+i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println("interupt occured");
            }
        }
    }
}

public class Thread1{
    public static void main(String[] args){
        Mythread t1=new Mythread("chlid thread");
        t1.start();
    }
            
}