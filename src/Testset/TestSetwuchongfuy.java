package Testset;

import java.util.HashMap;
import java.util.HashSet;

public class TestSetwuchongfuy {
    //HashSet无序无重复中的无重复原理
    public static void main(String[]args) {
        HashSet<String> h=new HashSet<String>();
        h.add(new String("小步"));
        h.add(new String("小步"));
        h.add(new String("小步"));
        h.add(new String("小步"));
        h.add(new String("小步"));
        System.out.println(h.size());//1
        HashSet<Person> p=new HashSet<Person>();
        p.add(new Person("小步",1));
        p.add(new Person("小步",2));
        p.add(new Person("小步",3));
        p.add(new Person("小步",4));
        p.add(new Person("小步",5));
        System.out.println(p.size());//5


        //没重写方法之前String输出长度为1，person输出长度为5，于是看person类中重写equals
        //重写equals方法后，执行发现依旧为1和5，猜测不只需要重写equals方法，还需要重写HashCode方法，于是看person类中重写HashCode
        //重写hashCode后输出结果为1和1，可以看出HashSet判定重复是看equals比较结果为true，hashCode比较的int一样时，判定重复
        //
        //看一下无重复储存的是第一个对象还是最后一个对象
        //System.out.println(p.iterator().next().getnumber());
        //不想输出对象这么麻烦，所以重写toString方法，于是看Person类中重写toString
        System.out.println(p);
    }
}
