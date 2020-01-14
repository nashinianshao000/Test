package TestIOC;

import 单例模式.Test;

public class TestMain {
    public static void main(String[]args){
        TestIoc t=new TestIoc();
        Person p=(Person) t.chuLi("TestIOC.Person");
        System.out.println(p);
    }
}
