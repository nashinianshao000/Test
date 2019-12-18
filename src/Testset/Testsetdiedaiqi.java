package Testset;

import java.util.HashSet;
import java.util.Iterator;

public class Testsetdiedaiqi {
    public static void main(String[]args){
       //以下为迭代器使用方法，HashSet在1.2版本出现，1.5版本后才可以使用增强for循环遍历，
        // 1.5之前想要遍历HashSet只能使用迭代器

        HashSet<String> h=new HashSet<String>();
        h.add("a");
        h.add("b");
        h.add("c");
        h.add("W");
        h.add("A");
        Iterator<String> it=h.iterator();
        while(it.hasNext()){
            String a=it.next();
                System.out.println(a);
        }
        System.out.println(h);
    }
}
