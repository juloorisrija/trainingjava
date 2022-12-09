package thread.java;

public class ThreadClass implements Runnable{
   Thread t;
   int t1,t2;
        ThreadClass(int t1,int t2) {
            this.t1 = t1;
            this.t2 = t2;
            t.start();
        }
           @Override
           public void run() {
            // Thread is in Running state
               System.out.println("sum of numbers is "+(t1+t2));
               System.out.println("sub of the two numbers is "+(t1-t2));
               System.out.println("mul of the two numbers is "+(t1*t2));
           }
       }




