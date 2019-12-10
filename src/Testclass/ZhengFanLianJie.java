package Testclass;

public class ZhengFanLianJie {
    public String lianJie(String str){
       FanZhuan f=new FanZhuan();
       String value=f.fanZhuan(str);
        String result=str.concat(value);
        return result;
    }
    public static void main(String[]args){
        ZhengFanLianJie a=new ZhengFanLianJie();
        String str=a.lianJie("12345");
        System.out.println(str);
    }
}
