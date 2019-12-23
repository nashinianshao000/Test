package KaoShiXiTong;

import java.util.Scanner;

public class XueSheng {
    public String [] daan=new String[5];
    public int x=0;
    public XueSheng(String[] ti){

    }
    public void zuoTi(){

            Scanner input=new Scanner(System.in);
            String d=input.nextLine();
            daan[x]=d;
       x++;

    }
    public String[] getDaan(){
        return daan;
    }
}
