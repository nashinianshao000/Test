package KaoShiXiTong;

        import 学生机房电脑.xuesheng;

        import java.util.*;

public class KaoShiJi {
    private HashMap<String, String> denglu = new HashMap<>();

    {
        denglu.put("sunyue", "123");
        denglu.put("gongchen", "456");
        denglu.put("xiaobu", "789");
    }

    public String dengLu(String zhanghao, String mima) {
        String d = denglu.get(zhanghao);
        if (d != null && d.equals(mima)) {
            System.out.println("登陆成功，开始答题");
        }
        return "用户名或密码错误";
    }

    ///////////////////////////////////////////////////////////////////////////////////////////登录完事
    //题库
    public HashMap<String, String> h = new HashMap<>();
    {
        h.put("第一题", "A");h.put("第二题", "B");h.put("第三题", "D");h.put("第四题", "C");h.put("第五题", "A");h.put("第六题", "D");h.put("第七题", "A");h.put("第八题", "C");h.put("第九题", "A");h.put("第十题", "B");
    }
    //试卷
    int y = 0;
    public HashSet<String> shijuan = new HashSet<>();
    {
        shijuan.addAll(h.keySet());
    }
    String[] daan=new String[5];
    public String[] huoQuTi() {
        Iterator<String> i = shijuan.iterator();

        String[] e =new String[5];
        while (y < 5) {
            int f=0;
            e[f] = i.next();
            daan[f]=h.get(e);
            System.out.println(e[f]);
            f++;
            XueSheng x = new XueSheng(e);
            x.zuoTi();
            y++;
        }
        return e;
    }
    public String[] huoQuDaAn(){
        return daan;
    }
}

