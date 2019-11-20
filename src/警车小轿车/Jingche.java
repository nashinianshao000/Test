package 警车小轿车;

public class Jingche {
    private int sudu;
    public Jingche(){}
    public Jingche(int sudu){
        this.sudu=sudu;
    }
    public void zhuiji(Jiaoche jiaoche){
        System.out.println("警车开始追击");
        int jiaochesudu=jiaoche.getsudu();
        if(this.sudu>jiaochesudu){
            for(int x=0;x<=100;x++){
                if(sudu*x==jiaochesudu*x+100){
                    System.out.println("追击时间为"+x+"秒");
                    break;
                }
            }
        }else{
            System.out.println("追不上啦");
        }

    }
}
