package TestAnnotation;

import TestAnnotation.Person;

public class TestMain {
    public static void main(String[]args){
        Myspring m=new Myspring();
        Person person=(Person) m.cunRu("TestAnnotation.Person");
        System.out.println(person.getName()+person.getAge()+person.getSex());
    }
}
