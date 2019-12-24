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
            return "登陆成功，开始答题";
        }
        return "用户名或密码错误";
    }
    public HashSet<Question> q = new HashSet<Question>();
    {
        q.add(new Question("第1题","A"));
        q.add(new Question("第2题","B"));
        q.add(new Question("第3题","A"));
        q.add(new Question("第4题","D"));
        q.add(new Question("第5题","C"));
        q.add(new Question("第6题","A"));
        q.add(new Question("第7题","C"));
        q.add(new Question("第8题","B"));
        q.add(new Question("第9题","D"));
        q.add(new Question("第10题","A"));
    }
    //试卷
    public ArrayList<Question> huoQuShiJuan(){
        System.out.println("考试机正在生成试卷");
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        ArrayList<Question> shijuan = new ArrayList<Question>(this.q);
        HashSet<Question> xinshijuan = new HashSet<Question>();
        while(xinshijuan.size()!=5) {
            int x=new Random().nextInt(this.q.size());
            xinshijuan.add(shijuan.get(x));
        }
        return new ArrayList<Question>(xinshijuan);
    }
}