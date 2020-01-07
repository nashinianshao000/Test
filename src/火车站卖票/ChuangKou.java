package 火车站卖票;

public class ChuangKou extends Thread {
    private String name;

    public ChuangKou(String name) {
        this.name = name;
    }

    public void run() {
        this.maiPiao();
    }

    public void maiPiao() {
        while (true) {
            XiTong12306 xt = XiTong12306.huoquxt();
            HuoChePiao hc = xt.chuPiao();
            if (hc == null) {
                System.out.println(this.name + "无票了");
                break;
            }
                System.out.println(this.name + hc);
        }
    }
}