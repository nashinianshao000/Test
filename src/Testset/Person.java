package Testset;

public class Person {
    //自己写的一个类
    public String name;
    public int number;
    public Person(String name,int number){
        this.name=name;
        this.number=number;
    }
    public String getname(){
        return this.name;
    }
    public int getnumber(){
        return this.number;
    }
    //分别往HashSet中存入String与自己写的Person,发现String不可重复，Person可重复，猜测因为String中重写了toString方法，
    //所以将Person中toString方法按照String中同样重写
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj instanceof Person){
           Person a=(Person)obj;
           if(a.name.equals(this.name)){
                return true;
           }
        }
        return false;

    }
    //由于只是想让name相同时的hashCode也相同，所以直接将hashCode值重写为name的hashCode值
    public int hashCode(){
        return this.name.hashCode();
    }
    public String toString(){
        StringBuilder s=new StringBuilder(this.name);
        s.append("+");
        s.append(this.number);
        return s.toString();
    }
}
