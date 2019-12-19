package Testset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet();
        t.add(new String("小步"));
        t.add(new String("小步"));
        t.add(new String("小步"));
        t.add(new String("小步"));
        t.add(new String("小步"));
        System.out.println(t.size());//1
        TreeSet<Person> p = new TreeSet();
        p.add(new Person("小步", 1));
        p.add(new Person("小步", 2));
        p.add(new Person("小步", 3));
        p.add(new Person("小步", 4));
        p.add(new Person("小步", 5));
        System.out.println(p.size());//5
        //直接执行会出现异常，因为person类中无compareto方法，需要让person类实现compareable接口，重写compareto方法，
    }
}
