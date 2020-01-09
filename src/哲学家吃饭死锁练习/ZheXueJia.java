package 哲学家吃饭死锁练习;

import KaoShiXiTong.LaoShi;

public class ZheXueJia extends Thread{
    private String name;
    private KuaiZi lift;
    private KuaiZi right;
    private int time;
    public ZheXueJia(String name,KuaiZi lift,KuaiZi right,int time){
        this.name=name;
        this.lift=lift;
        this.right=right;
        this.time=time;
    }
    public void run(){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (lift) {
            System.out.println(this.name + "拿起了左手的" + this.lift.getName() + "号筷子");
                synchronized (right){
                    System.out.println(this.name + "拿起了右手的" + this.right.getName() + "号筷子");
                    System.out.println(this.name+"开始用餐");
                }
        }
        System.out.println(this.name+"用餐完毕");
    }
}
