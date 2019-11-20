public class shuzu2 {
    public int[] touweijiaohuan(int[] v){
        int g=0;
        int[] z=new int[v.length];
        for(int a=v.length-1;a>0;a--){
            z[a]=v[g];
            g++;
        }
        return z;
    }
    public static void main(String[]args){
        shuzu2 o=new shuzu2();
        int[] x={1,2,3,4,7,8,0};
        int[] value=o.touweijiaohuan(x);
        x=value;
        for(int h:x){
            System.out.println(h);
        }
    }
}
