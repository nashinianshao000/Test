package Testclass;

public class PanDuanHuiWen {
    public boolean huiWen(String str){
        FanZhuan a=new FanZhuan();
        if(a.fanZhuan(str).equals(str)){
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        PanDuanHuiWen p=new PanDuanHuiWen();
        boolean w=p.huiWen("123421");
        System.out.println(w);
    }
}
