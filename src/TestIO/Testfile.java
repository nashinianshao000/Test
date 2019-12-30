package TestIO;

import java.io.*;

public class Testfile {
    public static void main(String[]args) throws IOException {
        //读取到数组中
//        try {
//            FileInputStream f=new FileInputStream("D://Test//Test.txt");
//            byte[] a=new byte[5];
//            int count=f.read(a);
//            while(count!=-1){
//                String b=new String(a,0,count);
//                count=f.read(a);
//                System.out.print(b);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        //挨个读取
//        FileInputStream f=new FileInputStream("D://Test//Test.txt");
//        int d=f.read();
//        while(d!=-1){
//            System.out.print((char)d);
//            d=f.read();
//        }
        //输出
        FileOutputStream f =null;
        try {
            f=new FileOutputStream(new File("D://test//aaa.txt"), true);
            f.write(97);
            f.write(98);
            String s = "1+1=2";
            f.write(s.getBytes());
        }catch(IOException e){

        }finally {
            if(f!=null) {
                f.close();
            }
        }

        }
}
