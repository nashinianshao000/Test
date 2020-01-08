package 生产者消费者模型;

public class ShengChanZhe extends Thread{
    private CangKu ck;
    public ShengChanZhe(CangKu ck){
        this.ck=ck;
    }
    public void run(){
        while(true) {
            ck.add();
            System.out.println("生产者放入了一件货物");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
