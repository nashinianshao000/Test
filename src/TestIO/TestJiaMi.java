package TestIO;

import java.io.*;

public class TestJiaMi {
    public void jiami(File file,String s){
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
                fis=new FileInputStream(file);
                File r=new File(s+"//"+file.getName());
                fos=new FileOutputStream(r);
                byte[] b=new byte[1024];
                int count=fis.read(b);
                while(count!=-1){
                    byte g=b[0];
                    b[0]=b[1];
                    b[1]=g;
                    fos.write(b,0,count);
                    fos.flush();
                    count=fis.read(b);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
    public static void main(String[]args){
        TestJiaMi t=new TestJiaMi();
        t.jiami(new File("D://Test//123.rar"),"D://xinlianxi");
    }
}
