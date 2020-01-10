package Testclass类练习;

import java.lang.reflect.Field;

public class ChangeString {
    public static void main(String[]args){
        String s=new String("123");
        System.out.println(s);
        Class clazz=s.getClass();
        Field f= null;
        try {
            f = clazz.getDeclaredField("value");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f.setAccessible(true);
        try {
            char[] c=(char [])f.get(s);
            c[0]='a';
            c[1]='b';
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
            System.out.println(s);
    }


}
