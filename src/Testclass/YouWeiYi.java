package Testclass;

public class YouWeiYi {
    public String weiYi(String str,int x){
        if(x>str.length()){
            x%=str.length();
        }
        String begin=str.substring(0,str.length()-x);
        String end=str.substring(str.length()-x);
        return end.concat(begin);
    }
    public static void main(String[]args){
        YouWeiYi s=new YouWeiYi();
        String str=s.weiYi("123456",15);
        System.out.println(str);
    }
}
