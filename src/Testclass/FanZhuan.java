package Testclass;

public class FanZhuan {
    public String fanZhuan(String str) {
        char[] a = str.toCharArray();
        for (int x=0; x<a.length/2;x++){
            char y=a[x];
            a[x]=a[a.length-x-1];
            a[a.length-x-1]=y;
        }
        return new String(a);
    }

    public static void main(String[] args) {
        FanZhuan s = new FanZhuan();
        String f = s.fanZhuan("abcde");
        System.out.println(f);

    }
}