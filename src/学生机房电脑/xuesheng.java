package 学生机房电脑;

public class xuesheng {
    private String name;

    public xuesheng(){}
    public xuesheng(String name){
        this.name=name;
    }
    public void jinru(){
        System.out.println(name+"进入了机房");
    }
    public void shiyongdiannao(diannao diannao){
        System.out.println(this.name+"开始使用电脑");
        diannao.beidakai();
        diannao.beishoyongzhong();

    }
    public String getname(){
        return this.name;
    }
}
