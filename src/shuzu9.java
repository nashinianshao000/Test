public class shuzu9 {
    public void paixu(int[] x,boolean z){
        int y=0;
        for(int a=1;a<x.length;a++){
            for(int b=x.length-1;b>a-1;b--){
                if(z==true&&x[b]<x[b-1]||z==false&&x[b]>x[b-1]){
                    y=x[b-1];
                    x[b-1]=x[b];
                    x[b]=y;
                }
            }
        }
    }
    public static void main(String[] args){
        shuzu9 o=new shuzu9();
        int[] a={1,3,4,6,8,32,2,6};
        o.paixu(a,false);
        for(int v:a){
            System.out.print(v+",");
        }
    }
}
