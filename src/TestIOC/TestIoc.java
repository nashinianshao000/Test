package TestIOC;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestIoc {
    public Object chuLi(String name){
        Object obj=null;
        try {
            Class clazz=Class.forName(name);
            obj=clazz.newInstance();
            Field[] fields=clazz.getDeclaredFields();
            for(Field field:fields){
                String fieldname=field.getName();
                String firstname=fieldname.substring(0,1).toUpperCase();
                String lastname=fieldname.substring(1);
                StringBuilder stringBuilder=new StringBuilder("set");
                stringBuilder.append(firstname);
                stringBuilder.append(lastname);
                Class clasz=field.getType();
                Method method=clazz.getMethod(stringBuilder.toString(),clasz);
                Scanner input=new Scanner(System.in);
                System.out.println("请输入属性值");
                String value=input.nextLine();
                Constructor constructor=clasz.getConstructor(String.class);
                method.invoke(obj,constructor.newInstance(value));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
