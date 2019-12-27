package TestIO;

import java.io.File;
import java.io.IOException;

public class TestIO {
    //递归遍历文件夹方法
    public void bianli(File f){
        System.out.println(f.getAbsolutePath());
        File[] e=f.listFiles();
        if(e!=null&&e.length!=0){
            for(File a:e){
                this.bianli(a);
            }
        }
    }
    //递归删除文件夹方法
    public void shanchu(File f){
        File[] e=f.listFiles();
        if(e!=null&&e.length!=0){
            for(File a:e){
                this.shanchu(a);
            }
        }
        f.delete();
    }
    public static void main(String[]args) {
        File f = new File("D://Test");
        TestIO t=new TestIO();
        //t.bianli(f);
        t.shanchu(f);

    }
}
