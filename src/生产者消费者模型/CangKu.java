package 生产者消费者模型;

import java.util.ArrayList;

public class CangKu {
    private ArrayList a=new ArrayList();
    public synchronized void add(){
        if(a.size()<20) {
            a.add("a");
        }else {
            try {
                this.notifyAll();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public synchronized void quChu(){
        if(a.size()>0) {
            a.remove(0);
        }else {
            this.notifyAll();
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
