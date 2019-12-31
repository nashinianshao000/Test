package TestIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestWenJianJiaFuZhi {
    public void wenJianJiaFuZhi(File file,String s){
        String oldpath=file.getAbsolutePath();
        String newpath=oldpath.split(":")[1];
        File newfile=new File(s+newpath);
        File[] files=file.listFiles();
        if(files!=null){
            newfile.mkdir();
            if(files.length!=0){
                for(File g:files) {
                    this.wenJianJiaFuZhi(g,s);
                }
            }
        }else{
            FileInputStream fis=null;
            FileOutputStream fos=null;
            try {
                fis=new FileInputStream(file);
                fos=new FileOutputStream(newfile);
                byte[] b=new byte[1024];
                int count=fis.read(b);
                while(count!=-1){
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

    }
    public static void main(String[]args){
        TestWenJianJiaFuZhi t=new TestWenJianJiaFuZhi();
        t.wenJianJiaFuZhi(new File("D://Test"),"D://xinlianxi");
    }
}
