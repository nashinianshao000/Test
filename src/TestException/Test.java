package TestException;

public class Test {
    public String yichang(){
        try{
            System.out.println("方法开始");
            String s="123";
            s.length();
            System.out.println("方法结束");
            return "第一个返回值";
        } catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("FINALLY");
        }
        return "第二个返回值";
    }
    public static void main(String[]args){
        Test t=new Test();
        String a=t.yichang();
        System.out.println(a);
    }
}
