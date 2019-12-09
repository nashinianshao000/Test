package Testclass;

import java.util.Scanner;

public class Teststring {
    public static void main(String[]args){
       String[] a={"sunyue-123","gongchen-456","xiaobu-789"};
        Scanner input =new Scanner(System.in);
        System.out.println("请输入账号");
        String zhanghao=input.nextLine();
        System.out.println("请输入密码");
        String mima=input.nextLine();
        boolean y=true;
        for(int x=0;x<a.length;x++){
            String[] mi=a[x].split("-");
            if(mi[0].equals(zhanghao)){
                if(mi[1].equals(mima)){
                    System.out.println("登录成功");
                    y=false;
                }
                break;
            }
        }
        if(y){
            System.out.println("登录名或密码错误");
        }
    }
}
