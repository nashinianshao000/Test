package Testclass类练习;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Testclass {
    public static void main(String[] args) {
        try {
//            Class clazz = Class.forName("D://Javatest//src//Testclass类练习//Person.java");
            Class clazz=Person.class;
            //获取当前类修饰符的方法
            int a=clazz.getModifiers();
            //获取当前类名称方法
            String b=clazz.getName();
            //获取当前类简名方法
            String c=clazz.getSimpleName();
            //获取当前类包名方法，返回值为package
            Package d=clazz.getPackage();
            String e=d.getName();
            //获取当前类的父类方法
            Class f=clazz.getSuperclass();
            while (f!=null){
                String g=f.getSimpleName();
                System.out.println(g);
                f=f.getSuperclass();
            }
            //获取当前类的所有接口方法
            Class[] clasz=clazz.getInterfaces();
            int h=clasz.length;
            //默认创建此类无参数构造方法
            Person person=(Person)clazz.newInstance();
            System.out.println(person);
            //获取该类中属性方法
            Field k=clazz.getField("name");
            int l=k.getModifiers();
            System.out.println(l);
            Field[] y=clazz.getFields();
            for(Field t:y){
                System.out.println(t.getName());
            }
            //改变私有属性的值方法
            Field g=clazz.getDeclaredField("name");
            g.setAccessible(true);
            Person pp=(Person)clazz.newInstance();
            System.out.println(pp.getName());
            g.set(pp,"456");
            System.out.println(pp.getName());
//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(c);
//            System.out.println(d);
//            System.out.println(e);

            System.out.println(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}