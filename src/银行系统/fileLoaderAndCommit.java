package 银行系统;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;

public class fileLoaderAndCommit {
    //将文件中的信息读入集合方法
    HashMap<String,User> hashMap=new HashMap<String,User>();
    private String filename=null;
    public fileLoaderAndCommit(String filename){
        this.filename=filename;
    }
    public HashMap<String,User> duRu(){
        FileReader fr=null;
        BufferedReader bfr=null;
        try {
            fr = new FileReader(filename);
            bfr=new BufferedReader(fr);
            String s=bfr.readLine();
            while(s!=null){
                String[] ss=s.split("-");
                User user=new User(ss[0],ss[1],Float.parseFloat(ss[2]));
                hashMap.put(ss[0],user);
                s=bfr.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bfr!=null){
                    bfr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return hashMap;
    }
    //将更新完的haspmap集合全部重新写入文件中，原来文件中的内容被覆盖
    public void cunRuXinZhi(HashMap hash){
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter=new FileWriter(filename);
            bufferedWriter=new BufferedWriter(fileWriter);
            Iterator<String> zhanghaos=hashMap.keySet().iterator();
            while(zhanghaos.hasNext()) {
                String b = zhanghaos.next();
                User userone = hashMap.get(b);
                StringBuilder ss = new StringBuilder(userone.getZhanghao());
                ss.append("-");
                ss.append(userone.getMima());
                ss.append("-");
                ss.append(userone.getYue());
                bufferedWriter.write(ss.toString());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(fileWriter!=null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bufferedWriter!=null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
