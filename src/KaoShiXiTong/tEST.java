package KaoShiXiTong;

import java.util.Scanner;

public class tEST {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入账号");
        String zhanghao=input.nextLine();
        System.out.println("请输入密码");
        String mima=input.nextLine();
        KaoShiJi k=new KaoShiJi();
        k.dengLu(zhanghao,mima);
        //
        String[] e=k.huoQuTi();
        XueSheng x=new XueSheng(e);
        String []r=x.getDaan();
        String []zhendaan=k.huoQuDaAn();
        LaoShi l=new LaoShi();
        int p=l.panJuan(zhendaan,r);
        System.out.println(p);
    }
}
