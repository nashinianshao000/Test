package Testclass;

public class MeiYiGeShouZiMuDaXie {
    public String daXie(String str){
        String b=" ";
            String[] a=str.split(" ");
            for(int x=0;x<a.length;x++){
                String daxie=a[x].substring(0,1).toUpperCase();
                String xiaoxie=a[x].substring(1).toLowerCase();
                String xin=daxie.concat(xiaoxie);
                b=b.concat(xin+" ");
            }
            return b.trim();
    }
    public static void main(String[]args) {
        MeiYiGeShouZiMuDaXie m=new MeiYiGeShouZiMuDaXie();
        String u=m.daXie("this is a new star");
        System.out.println(u);
    }
}
