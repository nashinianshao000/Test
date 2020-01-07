package 火车站卖票;

import java.util.HashMap;
import java.util.Vector;

public class XiTong12306 {
    private XiTong12306(){}
    private static XiTong12306 xt=new XiTong12306();
    public static XiTong12306 huoquxt(){
        return xt;
    }
    private Vector<HuoChePiao> v=new Vector<HuoChePiao>();
    {
        for(int x=10;x<100;x++) {
            v.add(new HuoChePiao("北京"+x,"哈尔滨"+x,(x%5+5)*100F));
        }
    }
    public HuoChePiao chuPiao() {
        if(v.size()>0){
            return v.remove(0);
        }
        return null;
    }
}
