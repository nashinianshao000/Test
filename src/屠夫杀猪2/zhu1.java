package 屠夫杀猪2;

public class zhu1 {
    public String name;
    public int tizhong=20;
    public zhu1(){ }
    public zhu1(String name){
        this.name=name;
    }
    public int zhangda(int month){
        for(int x=1;x<=month;x++){
            tizhong=this.tizhong*2;
        }
        return tizhong;
    }
    public String getname(){
        return this.name;
    }
    public int gettizhong(){
        return tizhong;
    }
    public void beisha1(){
        System.out.println(this.name+"被杀啦");
    }
}
