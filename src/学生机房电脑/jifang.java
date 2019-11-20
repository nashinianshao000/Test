package 学生机房电脑;

public class jifang {
    public diannao[] diannao=new diannao[5];
    public jifang(){
        this.fuzhi();
    }
    public void fuzhi(){
        for(int y=0;y<diannao.length;y++){
            diannao[y]=new diannao(y+1);
        }
    }
    public void jinru(xuesheng xuesheng){
        String xueshengname=xuesheng.getname();
        System.out.println(xueshengname+"进入了机房");
        for(int x=0;x<diannao.length;x++){
            boolean diannaos=diannao[x].iszhuangtai();
            if(!diannaos){
                xuesheng.shiyongdiannao(diannao[x]);
                break;
            }
        }
    }
}
;