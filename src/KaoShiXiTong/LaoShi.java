
package KaoShiXiTong;

import java.util.ArrayList;

public class LaoShi {
    public int panJuan(String[] zhendaan, ArrayList<Question> q){
        int fenShu=0;
        for(int x=0;x<q.size();x++){
            if(zhendaan[x].equalsIgnoreCase(q.get(x).getDaan())){
                fenShu+=100/q.size();
            }
        }
        return fenShu;
        }
}
