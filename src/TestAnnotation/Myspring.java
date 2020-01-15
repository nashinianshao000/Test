package TestAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Myspring {
    public Object cunRu(String name){
        Object obj=null;
        try {
            Class clazz=Class.forName(name);
            Constructor constructor=clazz.getConstructor();
            obj=constructor.newInstance();
            Annotation annotation=constructor.getAnnotation(MyAnnotation.class);
            Class clasz=annotation.getClass();
            Method method1=clasz.getMethod("value");
            String[] s=(String[])method1.invoke(annotation);
            Field[] fields=clazz.getDeclaredFields();
            for(int x=0;x<fields.length;x++){
                String fieldname=fields[x].getName();
                String firstname=fieldname.substring(0,1).toUpperCase();
                String lastname=fieldname.substring(1);
                StringBuilder stringBuilder=new StringBuilder("set");
                stringBuilder.append(firstname);
                stringBuilder.append(lastname);
                Class shuxingleixing=fields[x].getType();
                Method method=clazz.getMethod(stringBuilder.toString(),shuxingleixing);
                method.invoke(obj,shuxingleixing.getConstructor(String.class).newInstance(s[x]));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
