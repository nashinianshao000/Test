
package KaoShiXiTong;

public class LaoShi {

    public int fenShu=0;
    public int panJuan(String[] zhendaan,String[] daan){
        for(int x=0;x<daan.length;x++){
            if(zhendaan[x].equals(daan[x])){
                fenShu+=20;
            }
        }
        return fenShu;
        }
}
