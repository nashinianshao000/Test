package Testclass;

public class ZiMuChuXianCiShu {
    public int chuXian(String str, char c) {
        return str.length() - str.replace(String.valueOf(c), "").length();
//        int x=0;
//        for(int y=0;y<str.length();y++){
//            if(str.charAt(y)==c){
//                x++;
//            }
//        }
//
//        return x;
    }
       public static void main(String[]args) {
           ZiMuChuXianCiShu z = new ZiMuChuXianCiShu();
           int u = z.chuXian("asdfgfghaaassda", 'a');
           System.out.println(u);
       }
    }

//第二种方法
