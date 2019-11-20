import java.util.Scanner;
public class shuzu10 {
    public String[][] a={{"gongchen","123"},{"xiaobu","456"},{"sunyue","789"}};
    public String denglu(String x,String y){
        String g="用户名或密码错误";
        for(int d=0;d<a.length;d++){
            if(a[d][0].equals(x)){
                if(y.equals(a[d][1])){
                    g= "密码正确";
                }
            }
        }
        return g;
    }
    public static void main(String[]args){
        shuzu10 t=new shuzu10();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入账号");
        String a=input.nextLine();
        System.out.println("请输入密码");
        String b=input.nextLine();
        String g=t.denglu(a,b);
        System.out.println(g);
    }
}
