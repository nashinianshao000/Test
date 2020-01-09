package 短信轰炸Timer方法的练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class TestTimer extends Thread{
    private ArrayList<String> arrayList=new ArrayList<>();
    {
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
    }
    public void hongZha(){
        try {
            Timer timer = new Timer();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = simpleDateFormat.parse("2020-1-9 10:49:00");
            System.out.println("开始执行");
            timer.schedule(new TimerTask() {
                public void run() {
                    for (int i = 0; i <= 3; i++) {
                        System.out.println("向" + arrayList.get(i) + "发送了一条短信");
                    }
                }
            }, d, 3000);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        }
    public static void main(String[]args){
        TestTimer t=new TestTimer();
        t.hongZha();
    }
}
