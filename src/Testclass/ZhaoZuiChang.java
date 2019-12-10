package Testclass;

public class ZhaoZuiChang {
    public String zuiChang(String...strs){
       for(int y=1;y<strs.length;y++){
           if(strs[y].length()>strs[y-1].length()){
               strs[0]=strs[y];
           }
       }
       return strs[0];
    }
    public static void main(String[]args){
        ZhaoZuiChang s=new ZhaoZuiChang();
        String str=s.zuiChang("12345","123456","1234567","1234");
        System.out.println(str);
    }
}
