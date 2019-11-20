import java.util.Scanner;
public class jisuanqi1 {
    public float jia(float a,float b){
        float x=a+b;
        return x;
    }
    public float jian(float a,float b){
        float x=a-b;
        return x;
    }
    public float cheng(float a,float b){
        float x=a*b;
        return x;
    }
    public float chu(float a,float b){
        float x=a/b;
        return x;
    }
    public void jisuan(){
        Scanner input =new Scanner(System.in);
        System.out.println("请输入一个数字");
        String one=input.nextLine();
        float i = Float.parseFloat(one);
        ok:while(true) {
            System.out.println("请输入符号");
            String fuhao = input.nextLine();
            System.out.println("请输入第二个数字");
            String two = input.nextLine();
            float j = Float.parseFloat(two);
            jisuanqi1 value = new jisuanqi1();
            switch (fuhao) {
                case "+":
                    i = value.jia(i, j);
                    break;
                case "-":
                    i = value.jian(i, j);
                    break;
                case "*":
                    i = value.cheng(i, j);
                    break;
                case "/":
                    i = value.chu(i, j);
                    break;
                case"=":
                    break ok;
            }
            System.out.println(i);
        }
    }
    public static void main (String[]args){
        jisuanqi1 t=new jisuanqi1();
        t.jisuan();
    }
}
