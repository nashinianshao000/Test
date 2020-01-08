package Threadonetwothree练习;

public class ThreadTwo extends Thread{
    public void run(){
        System.out.println("Threadtwo start");
        ThreadThree threadThree=new ThreadThree(this);
        threadThree.start();
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Threadtwo over");
    }
}
