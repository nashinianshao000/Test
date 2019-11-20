package 汽车和车轮;

public class qiche {
    public String pinpai;
    public String xinghao;
    public chelun chelun;
    public qiche(){}
    public qiche(String pinpai,String xinghao,chelun chelun){
        this.pinpai=pinpai;
        this.xinghao=xinghao;
        this.chelun=chelun;

    }
    public void zhanshi(){

        System.out.println("这是一台"+pinpai+"牌的"+xinghao+"型号的车"+"车轮尺寸为"+chelun.chicun);
    }
}
