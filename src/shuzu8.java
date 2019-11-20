public class shuzu8 {
    public void sushu(int x,int y){
        int z=0;
        for(int a=x;a<=y;a++){
            for(int b=2;b<a;b++){
                if(a%b==0){
                    z++;
                    break;
                }
            }
        }
        int k=0;
        int[] c=new int[z];
        for(int a=x;a<=y;a++){
            for(int b=2;b<a;b++){
                if(a%b==0){
                    c[k]=a;
                    k++;
                    break;
                }
            }
        }
        for(int h:c){
            System.out.print(h+",");
        }
    }
    public static void main(String[]args){
        shuzu8 e=new shuzu8();
        e.sushu(2,100);
    }
}
