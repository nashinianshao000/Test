package KaoShiXiTong;

import java.util.ArrayList;
import java.util.Scanner;

public class tEST {
    public static void main(String[]args){
       KaoShiJi kaoshiji=new KaoShiJi();
       Scanner input=new Scanner(System.in);
       System.out.println("请输入姓名");
       String name=input.nextLine();
        System.out.println("请输入密码");
        String mima=input.nextLine();
       XueSheng xuesheng=new XueSheng(name,mima);
       String a=kaoshiji.dengLu(xuesheng.getName(),xuesheng.getMima());
       System.out.println(a);
       if(a.equals("登陆成功，开始答题")){
           ArrayList<Question> shijuan=kaoshiji.huoQuShiJuan();
           String[] daan=xuesheng.zuoTi(shijuan);
           LaoShi laoshi=new LaoShi();
           int fenshu=laoshi.panJuan(daan,shijuan);
           System.out.println("本次考试的分数为"+fenshu);
       }
    }
}
