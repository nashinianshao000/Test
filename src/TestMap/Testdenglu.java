package TestMap;

import java.util.*;

public class Testdenglu {
    //一维数组写登陆
    public String[] zhanghao = new String[]{"sunyue", "gongchen", "xiaobu"};
    public String[] mima = new String[]{"123", "456", "789"};
    public String denglu(String hao,String mi){
        for (int x = 0; x < zhanghao.length; x++) {
            if(zhanghao[x].equals(hao)){
                if(mima[x].equals(mi)){
                    return "登录成功";
                }
                break;
            }
        }
        return "用户名或密码错误";
    }

    //使用Arraylist类登录
    public ArrayList<String> a=new ArrayList<String>();
    {
        a.add("xiaobu-123");
        a.add("sunyue-456");
        a.add("gongchen-789");
    }
    public String dengLu2(String zhanghao,String mima){
        for(int y=0;y<a.size();y++){
           String[] value=a.get(y).split("-");
           if(value[0].equals(zhanghao)){
               if(value[1].equals(mima)){
                   return "登录成功";
               }
               break;
           }
        }
        return "账号名或密码错误";
    }
    //使用HashSet登录
    public HashSet<String> s=new HashSet<String>();
    {
        s.add("xiaobu-123");
        s.add("sunyue-456");
        s.add("gongchen-789");
    }
    public String denglu3(String zhanghao,String mima){
        Iterator<String> i=s.iterator();
            while(i.hasNext()){
                String e=i.next();
                String[] a=e.split("-");
                if(a[0].equals(zhanghao)){
                    if(a[1].equals("mima")){
                        return "登陆成功";
                    }
                    break;
                }
            }
                return "账号名或密码错误";
    }

    //使用Hashmap登录
    public HashMap<String,String> h=new HashMap<>();
    {
        h.put("xiaobu","123");
        h.put("sunyue","456");
        h.put("gongchen","789");
    }
        public String denglu2(String zhanghao,String mima){
        String q=h.get(zhanghao);
        if(q!=null&&q.equals(mima)){
             return "登陆成功";
        }
            return "账号名或密码错误";
    }
}