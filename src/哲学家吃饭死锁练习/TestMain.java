package 哲学家吃饭死锁练习;

public class TestMain {

    public static void main(String[]args){
        KuaiZi kuaiZi1=new KuaiZi(1);
        KuaiZi kuaiZi2=new KuaiZi(2);
        KuaiZi kuaiZi3=new KuaiZi(3);
        KuaiZi kuaiZi4=new KuaiZi(4);
        ZheXueJia zheXueJia1=new ZheXueJia("a",kuaiZi2,kuaiZi1,0);
        ZheXueJia zheXueJia2=new ZheXueJia("b",kuaiZi3,kuaiZi2,3000);
        ZheXueJia zheXueJia3=new ZheXueJia("c",kuaiZi4,kuaiZi3,0);
        ZheXueJia zheXueJia4=new ZheXueJia("d",kuaiZi1,kuaiZi4,3000);
        zheXueJia1.start();
        zheXueJia2.start();
        zheXueJia3.start();
        zheXueJia4.start();
    }
}
