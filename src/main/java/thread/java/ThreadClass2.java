package thread.java;

public class ThreadClass2 extends Thread{
    ThreadClass2(){
        super("Demo thread 2");
        System.out.println("Child Thread "+this);
        start();
    }
    @Override
    public void run() {  // Thread is in Running state
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println("Child thread: " + i);
                Thread.sleep(2000);   // Go to Sleep state : waiting
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Child Thread Exiting....");  // Thread is terminated

    }
}
