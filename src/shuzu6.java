public class shuzu6 {
    public int[][] chaifen(int[] x){
        int max=x[0];
        int max_index=0;
        for(int a=0;a<x.length;a++){
            if(max<x[a]){
                max=x[a];
                max_index=a;
            }
        }
        int[] a=new int[max_index];
        int[] b=new int[x.length-a.length-1];
        for(int i=0;i<a.length;i++){
            a[i]=x[i];
        }
        for(int j=0;j<b.length;j++){
            b[j]=x[x.length-b.length+j];
        }
        int[][] input={a,b};
        return input;
    }
    public static void main(String[]args){
        shuzu6 s=new shuzu6();
        int[] o={1,2,3,4,5,6,7,6,5,7,8,6,5,4,3};
        int[][] value=s.chaifen(o);
        int[] e=value[0];
        int[] f=value[1];
        for(int u:e){
            System.out.print(u);
        }
        System.out.println();
        for(int l:f){
            System.out.print(l);
        }
    }
}
