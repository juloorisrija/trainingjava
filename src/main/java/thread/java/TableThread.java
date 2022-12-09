package thread.java;

public class TableThread extends Thread{
    void table(int n){
        synchronized (this){
            for(int i=1;i<=10;i++){
                System.out.printf("%d*%d=%d \n",n,i,n*i);
            }
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println("thread interrupted");
            }
        }
    }


}
