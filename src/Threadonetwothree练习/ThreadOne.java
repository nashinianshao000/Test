package Threadonetwothree练习;

public class ThreadOne extends Thread{
    public void run(){
        System.out.println("Threadone start");
        ThreadTwo threadTwo=new ThreadTwo();
        threadTwo.start();
        try {
            threadTwo.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Threadone over");
    }
}
