package 屠夫杀猪2;

public class tufu1 {
    public void shazhu1(zhu1 pigg){
        System.out.println("屠夫执行了杀猪方法");

        String name=pigg.getname();
        int tizhong=pigg.gettizhong();
        System.out.println(name+"在体重"+tizhong+"的时候被杀啦");
        pigg.beisha1();
    }
}
