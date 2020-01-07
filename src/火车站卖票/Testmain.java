package 火车站卖票;

public class Testmain {
    public static void main(String[]args){
        ChuangKou c1=new ChuangKou("北京南");
        ChuangKou c2=new ChuangKou("北京北");
        ChuangKou c3=new ChuangKou("北京西");
        c1.start();
        c2.start();
        c3.start();
    }
}
