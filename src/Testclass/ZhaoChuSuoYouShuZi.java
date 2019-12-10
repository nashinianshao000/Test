package Testclass;

public class ZhaoChuSuoYouShuZi {
    String s="";
    public int zhaoChu(String str){
        for(int x=0;x<str.length();x++){
            if(str.codePointAt(x)>=48&&str.codePointAt(x)<57){
                s=s+(char)str.codePointAt(x);
            }
        }
        return Integer.parseInt(s);
    }
    public static void main(String[]args) {
        ZhaoChuSuoYouShuZi m=new ZhaoChuSuoYouShuZi();
        int u=m.zhaoChu("asfdfgg222j4hj4h5h5jh6");
        System.out.println(u);
    }
}
