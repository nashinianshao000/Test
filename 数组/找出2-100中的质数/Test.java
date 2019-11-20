public class Test{
    public static void main(String[]args){
        int i=0;
        int n=0;
        for(int x =2;x<=100;x++){
            int z=0;
            for(int y=2;y<x;y++){
                if(x%y==0){
                    z++;
                }
            }
            if(z>0){
                i++;
            }
        }
        int[] a=new int[i];
        int s =0;
        for(int x =2;x<=100;x++){
            int z = 0;
            for(int y=2;y<x;y++){
                if(x%y==0){
                    z++;
                }
            }
            if(z>0){
                a[s]=x;
                s++;

            }
        }
        for(int c:a){
            System.out.println(c);
        }

    }
}
