public class shuzu7 {
    public void qu0(int[] x){
        int a=0;
        for(int i=0;i<x.length;i++){
            if(x[i]!=0){
                a++;
            }
        }
        int[] y=new int[a];
        int z=0;
        for(int i=0;i<x.length;i++){
            if(x[i]!=0){
                y[z]=x[i];
                z++;
            }
        }
        for(int v:y){
            System.out.print(v);
        }
    }
    public static void main(String[]args){
        shuzu7 b=new shuzu7();
        int[] x={1,3,0,4,0,5,7,0,8};
        b.qu0(x);

    }
}
