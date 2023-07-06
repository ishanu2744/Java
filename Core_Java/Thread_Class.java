class MyThread1 extends Thread{
    MyThread1(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while (i<100){
            System.out.println("Welcome "+this.getName()+" "+this.getPriority());
            i++;
        }
    }
}
class MyThread2 extends Thread{

    public void run(){
        int i=0;
        while (i<100){
            System.out.println("Good Morning "+this.getPriority());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
public class Thread_Class {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1("Hello");
        MyThread2 t2=new MyThread2();
//        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
//        t2.start();
        System.out.println("Id of t1 & t2 Thread: "+t1.getId()+","+t2.getId());
        System.out.println("State of t1: "+t1.getState());
        Thread t3=new MyThread1("Thread");
        t3.start();
        t3.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Details of t3: "+t3.getName()+","+t3.getId()+","+t3.getPriority()+","+t3.getState());
    }
}
