package 银行系统;
import java.util.Scanner;

public class ATMService {
    //登陆方法
    private ATMDao atm=new ATMDao();
    public String dengLu(String zhanghao,String mima) {
        User user=atm.huoQuUser(zhanghao);
        if(user!=null&&user.getMima().equals(mima)){
            return "登录成功";
        }
        return "用户名或密码错误";
    }
    //查询余额方法
    public float chaXunYuE(String zhanghao){
        User User=atm.huoQuUser(zhanghao);
        return User.getYue();
    }
    //存钱方法
    public void cunQian(String zhanghao,float qianshu){
        User User=atm.huoQuUser(zhanghao);
            User.setYuE(User.getYue()+qianshu);
            atm.xiugai(User);
    }
    //取钱方法
    public void quQian(String zhanghao,float qianshu){
        User User=atm.huoQuUser(zhanghao);
            if(qianshu<=User.getYue()){
                User.setYuE(User.getYue()-qianshu);
                atm.xiugai(User);
            }else {
                System.out.println("余额不足");
            }
    }
    //转账方法
    public void zhuanZhang(String zhanghao,String zhanghao1,float qianshu){
        User User=atm.huoQuUser(zhanghao);
            if (atm.huoQuUser(zhanghao1) != null) {
                if(qianshu<=User.getYue()){
                    User.setYuE(User.getYue()-qianshu);
                    User a=atm.huoQuUser(zhanghao1);
                    a.setYuE(a.getYue()+qianshu);
                    atm.xiugai(User);
                }else {
                    System.out.println("余额不足");
                }
            }else {
                System.out.println("该用户不存在");
            }
    }
}