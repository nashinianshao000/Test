package 火车站卖票;

//想成为线程类可以继承Thread类，若已经继承其他的类，就只能实现Runnable接口，实现接口就没有start方法，只能通过重新创建thread类来调用stard方法
public class Testthread implements Runnable{
    public String name;
    public Testthread(){}
    public Testthread(String name){
        this.name=name;
    }
    public void run(){
        for(int x=0;x<100;x++){
            System.out.println(this.name+"跑到第"+x+"米啦");
        }
    }
}
