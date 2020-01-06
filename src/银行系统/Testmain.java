package 银行系统;

import java.util.Scanner;

public class Testmain {
    public static void main(String[]args){
        ATMService atm=new ATMService();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入账号");
        String zhanghao = input.nextLine();
        System.out.println("请输入密码");
        String mima = input.nextLine();
        String s=atm.dengLu(zhanghao,mima);
        if(s.equals("登录成功")){
            System.out.println("登录成功，请输入业务号码\n1.查询余额\n2.存钱\n3.取钱\n4.转账");
            String ss=input.nextLine();
            switch(ss){
                case "1":
                    Float a=atm.chaXunYuE(zhanghao);
                    System.out.println(a);
                    break;
                case "2":
                    System.out.println("请输入存入金额");
                    String sss=input.nextLine();
                    atm.cunQian(zhanghao,Float.parseFloat(sss));
                    break;
                case "3":
                    System.out.println("请输入取出金额");
                    String ssss=input.nextLine();
                    atm.quQian(zhanghao,Float.parseFloat(ssss));
                    break;
                case "4":
                    System.out.println("请输入转账金额");
                    String sssss=input.nextLine();
                    System.out.println("请输入转入账户名");
                    String zhanghao1=input.nextLine();
                    atm.zhuanZhang(zhanghao,zhanghao1,Float.parseFloat(sssss));
                    break;
            }
        }else {
            System.out.println("账户名或密码错误");
        }

    }
}
