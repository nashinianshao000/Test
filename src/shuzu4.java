import java.util.Scanner;

public class shuzu4 {
    public String zhaoxun(int[] y){
        boolean s=false;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int a=input.nextInt();
        for(int z:y){
            if(a==z){
                s=true;
            }
        }
        if(s){
             String n="数字在数组中存在";
             return n;
        }else{
            String b="数字在数组中不存在";
            return b;
        }
    }
    public static void main(String[]args){
        shuzu4 c=new shuzu4();
        int[] x={1,2,3,4,5,6,7,8};
        String value=c.zhaoxun(x);
        System.out.println(value);
    }
}
