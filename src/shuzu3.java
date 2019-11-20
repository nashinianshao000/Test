public class shuzu3 {
    public int[] jizhi(int[] c){
        int y=c[0];
        for(int a=0;a<c.length-1;a++){
            if(c[a]>c[a+1]){
               y=c[a+1];
            }
        }
        int z=c[0];
        for(int a=0;a<c.length-1;a++){
            if(c[a]<c[a+1]){
                z=c[a+1];
            }
        }
        int[] h={y,z};
        return h;
    }
    public static void main(String[]args) {
        shuzu3 a = new shuzu3();
        int[] x = {1, 2, 3, 4, 5, 6};
        int[] value=a.jizhi(x);
        for(int k:value){
            System.out.println(k);
        }
    }

};
