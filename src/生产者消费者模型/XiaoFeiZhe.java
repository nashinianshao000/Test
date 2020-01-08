package 生产者消费者模型;

public class XiaoFeiZhe extends Thread{
    private CangKu ck;
    public XiaoFeiZhe(CangKu ck){
        this.ck=ck;
    }
    public void run(){
        while(true){
        ck.quChu();
        System.out.println("消费者取出了一件货物");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
