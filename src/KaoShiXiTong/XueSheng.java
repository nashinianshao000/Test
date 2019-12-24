package KaoShiXiTong;

import java.util.ArrayList;
import java.util.Scanner;

public class XueSheng {
    private String name;
    private String mima;
    public XueSheng(String name,String mima){
        this.name=name;
        this.mima=mima;
    }
    public String getName(){
        return this.name;
    }
    public String getMima(){
        return this.mima;
    }
    public String[] zuoTi(ArrayList<Question> zuizhongshijuan){
        String[] daan=new String[zuizhongshijuan.size()];
        Scanner input=new Scanner(System.in);
        for(int x=0;x<zuizhongshijuan.size();x++){
            Question q=zuizhongshijuan.get(x);
            System.out.println((x+1)+","+q.getTimu());
            System.out.println("请输入答案");
            daan[x]=input.nextLine();
        }
        return daan;
    }
}
