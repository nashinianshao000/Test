package 生产者消费者模型;

public class TestMain {
    public static void main(String[]args) {
        CangKu ck = new CangKu();
        ShengChanZhe scz = new ShengChanZhe(ck);
        XiaoFeiZhe xfz = new XiaoFeiZhe(ck);
        XiaoFeiZhe xfz1 = new XiaoFeiZhe(ck);
        scz.setPriority(10);
        scz.start();
        xfz.start();
        xfz1.start();

    }
}
