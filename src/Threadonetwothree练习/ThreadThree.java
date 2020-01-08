package Threadonetwothree练习;

public class ThreadThree extends Thread{
    private ThreadTwo threadTwo;
    public ThreadThree(ThreadTwo threadTwo){
        this.threadTwo=threadTwo;
    }
    public void run(){
        System.out.println("Threadthree start");
        synchronized (threadTwo){
            try {
                sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Threadthree over");
    }
}
