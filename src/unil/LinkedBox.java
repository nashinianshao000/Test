package unil;

public class LinkedBox implements Box{
    public Node shoujiedian;
    public Node weijiedian;
    public int size;
    public boolean add(int shuju ) {
        this.cunru(shuju);
        size++;
        return true;
    }
    public int shanchu(int index) {
        this.panduansuoyin(index);
        Node a=this.zhaoxunyuansu(index);
        int x=this.bangshanchu(a);
        return x;
    }
    public int zhaoxun(int index) {
        Node s=this.zhaoxunyuansu(index);
        return s.zijishuju;
    }
    public int bianli() {
        return size;
    }
    public void cunru(int shuju){
         Node l=weijiedian;
         Node node=new Node(l,shuju,null);
         weijiedian=node;
         if(l==null){
            shoujiedian=node;
         }
         l.xiaduixiang=node;
    }
    public void panduansuoyin(int index){
        if(index<0||index>size-1){
            System.out.println("索引位置有误");
        }
    }
    public Node zhaoxunyuansu(int index){
        Node indexyuansu=shoujiedian;
        if(index<(size>>1)){
            indexyuansu=shoujiedian;
            for(int x=0;x<=index;x++){
                indexyuansu=indexyuansu.xiaduixiang;
            }
        }
        if(index>(size>>1)){
            indexyuansu=weijiedian;
            for(int x=size;x>=size-index+1;x--){
                indexyuansu=indexyuansu.shangduixiang;
            }
        }
        return indexyuansu;
    }
    public int bangshanchu(Node a){
        int x=a.zijishuju;
        Node i=a.shangduixiang;
        Node j=a.xiaduixiang;
        if(i==null){
            shoujiedian=j;
        }else{
            i.xiaduixiang=j;
            a.shangduixiang=null;
        }
        if(j==null){
            weijiedian=i;
        }else{
            j.shangduixiang=i;
            a.xiaduixiang=null;
        }
        size--;
        return x;
    }
}
