package 警车小轿车;

public class Cesuqi {
    private int cesushijian;
    public Cesuqi(){}
    public Cesuqi(int cesushijian){
        this.cesushijian=cesushijian;
    }
    public void cesu(Jiaoche jiaoche){
        int s=jiaoche.getsudu();
        int shijian=100/s;
        if(shijian<this.cesushijian){
            System.out.println("超速啦");
            Jingche jingche=new Jingche(40);
            jingche.zhuiji(jiaoche);
        }else{
            System.out.println("没超速");
        }
    }
}
