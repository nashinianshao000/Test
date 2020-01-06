package 银行系统;

import java.awt.geom.Arc2D;
import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -150409652278157757L;
    private String zhanghao;
    private String mima;
    private Float yue;
    public User(){}
    public User(String zhanghao,String mima,Float yue){
        this.zhanghao=zhanghao;
        this.mima=mima;
        this.yue=yue;
    }
    public String getZhanghao(){
        return this.zhanghao;
    }
    public String getMima(){
        return this.mima;
    }
    public Float getYue(){
        return this.yue;
    }
    public void setYuE(Float yue){
            this.yue=yue;
    }

}
