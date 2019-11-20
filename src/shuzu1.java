public class shuzu1 {
    public int[][] jiaohuan(int[]a,int[]b) {
        int[] c = a;
        a = b;
        b = c;
        int[][] result={a,b};
        return result;
    }
    public static void main(String[] args) {
        shuzu1 a = new shuzu1();
        int[] x={1,2,3,4,5};
        int[] y={4,5,8,4,3,7,9};
        int[][] value=a.jiaohuan(x,y);
        x=value[0];
        y=value[1];
        for(int i:x){
            System.out.print(i);
        }
        System.out.println();
        for(int j:y){
            System.out.print(j);
        }
    }
}