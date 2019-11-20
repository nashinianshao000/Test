package 学生机房电脑;

public class diannao {
    private boolean zhuangtai;
    private int number;
    public diannao(){
    }
    public diannao(int number){
        this.number=number;
    }
    public int huoqunumber(){
        return this.number;
    }
    public boolean iszhuangtai(){
        return this.zhuangtai;
    }
    public void beidakai(){
        this.zhuangtai=true;
        System.out.println(this.number+"号电脑被打开");
    }
    public void beiguanbi(){
        this.zhuangtai=false;
        System.out.println(this.number+"号电脑被关闭");
    }
    public void beishoyongzhong(){
        System.out.println(this.number+"号电脑被使用");
    }


}
