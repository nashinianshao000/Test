package TestIO;

import java.io.*;

public class TestFuZhiWenJianJia {
    //文件的复制方法
    public void xieru(File file,String path) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream(file);
            File newfile = new File(path+"//"+file.getName());
            fos=new FileOutputStream(newfile);
            byte[] b=new byte[1024];
            int count=fis.read(b);
            while(count!=-1){
                fos.write(b,0,count);
                fos.flush();
                count=fis.read(b);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
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
        TestFuZhiWenJianJia w=new TestFuZhiWenJianJia();
        w.xieru(new File("D://Test//aaa.txt"),"D://xinlianxi//aaa.txt");
    }
//    //文件夹的复制方法
//    public void bianli(File r){
//        File[] a=r.listFiles();
//        while(a!=null&&a.length!=0){
//            for(File b:a){
//                this.bianli(b);
//            }
//        }
//        this.wenjianfuzhi(r);
//    }
//    public void wenjianfuzhi(File q)  {
//        try {
//            FileInputStream f=new FileInputStream(q);
//            f.read();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
////    public void wenJianJiaFuZhi(String yuanwenjianjia,String xinwenjianjia){
////        File f=new File(yuanwenjianjia);
////        File e=new File(xinwenjianjia);
////        this.bianli(new File(yuanwenjianjia));
////
////    }


}
