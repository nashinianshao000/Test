public class Arraybox {
    public int[] box=new int[10];
    public int size=0;
    public boolean cunzhi(int array){
        int a=array;
        this.panduangou(size+1);
        box[size++]=a;
        return true;
    }
    public void panduangou(int e){
        if(e-box.length>0){
            this.kuorong(e);
        }
    }
    public void kuorong(int min){
        int x=box.length;
        int max=x+(x>>1);
        if(min-max>0){
            max=min;
        }
        box=this.banyun(box,max);
    }
    public int[] banyun(int[] v,int d){
        int[] y=new int[d];
        for(int f=0;f<box.length;f++){
            y[f]=box[f];
        }
        return y;
    }
    public void bianli(){
        for(int g:box){
            System.out.println(g);
        }
    }
}
