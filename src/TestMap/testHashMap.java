package TestMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class testHashMap {
    public static void main(String[]args){
        HashMap<Integer,String> h=new HashMap<Integer,String>();
        h.put(1,"aaa");
        h.put(2,"aaa");
        h.put(10,"ddd");
        h.put(3,"aaa");
        h.put(10,"aaa");
        h.put(24,"aaa");
        h.put(8,"aaa");
        h.putIfAbsent(3,"fff");
        System.out.println(h);
        h.remove(2);
        System.out.println(h);
        System.out.println(h.getOrDefault(100,"1444"));

        //使用迭代器方法遍历该集合
        Set<Integer> keys=h.keySet();
        Iterator<Integer> s=keys.iterator();
        while(s.hasNext()){
            Integer i=s.next();
            String y=h.get(i);
            System.out.println(i+y);

        }


    }
}
