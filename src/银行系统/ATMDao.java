package 银行系统;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ATMDao {
    private fileLoaderAndCommit flac=new fileLoaderAndCommit("D://Javatest//src//银行系统//YinHang.txt");
    private HashMap<String,User> hashMap=flac.duRu();
    //通过账号名获取User对象
    public User huoQuUser(String zhanghao){
        return hashMap.get(zhanghao);
    }
    //将某一个修改完毕的user对象存入集合
    public void xiugai(User user){
        hashMap.put(user.getZhanghao(),user);
        flac.cunRuXinZhi(hashMap);
    }
}

