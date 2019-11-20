public class shuzu5 {
    public int[] hebing(int[] x,int[] y){
        int[] c=new int[x.length+y.length];
        for(int a=0;a<c.length;a++){
            if(a<x.length){
                c[a]=x[a];
            }else{
                c[a]=y[a-x.length];
            }
        }
        return c;
    }
    public static void main(String[]args){
        shuzu5 c=new shuzu5();
        int[] i={1,2,3,4,5,6};
        int[] j={1,2,3,4,5};
        int[] value=c.hebing(i,j);
        for(int k:value){
            System.out.println(k);
        }
    }
}
