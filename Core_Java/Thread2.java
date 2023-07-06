class thread implements Runnable {
    Thread t;
    thread(){
        t=new Thread(this,"Demo Thread");
        System.out.println("Child Thread : "+ t);
        t.start();
    }
    public void run() {
        try {
            for(int i=0;i<10;i++){
                System.out.println("The Calcutta Technical School");
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e ){
                e.printStackTrace();
        }
    }
}

class Thread2 {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("The current thread information : "+t);
        thread t2=new thread();
        try {
            for(int i=0;i<10;i++)
                System.out.println("Women's Collage");
                Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main thread Exiting");
    }

}
