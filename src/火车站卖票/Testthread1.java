package 火车站卖票;

public class Testthread1 {
    public static void main(String[] args) {
        Testthread t1 = new Testthread("gongchen");
        Testthread t2 = new Testthread("sunyue");
        Testthread t3 = new Testthread("xiaobu");
        Thread r1=new Thread(t1);
        Thread r2=new Thread(t2);
        Thread r3=new Thread(t3);
        r1.start();
        r2.start();
        r3.start();
    }
}
