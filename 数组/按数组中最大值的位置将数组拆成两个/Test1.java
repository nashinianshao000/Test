public class Test1{
	public static void main(String[]args){
		int[] x={1,2,3,9,4,5};
		int max =x[0];
		int max_index=0;
		
		for(int i=0;i<x.length;i++){
			if(x[i]>max){
				max=x[i];	
				max_index=i;			
			}
		}
		int[] a=new int[max_index];
		int[] b=new int[x.length-max_index-1];
		for(int y=0;y<a.length;y++){
			a[y]=x[y];
		}
		for(int y=0;y<b.length;y++){
			b[y]=x[a.length+y+1];
		}
		for(int y:a){
			System.out.print(y);
		}System.out.println();
		for(int z:b){
			System.out.print(z);
		}		
	}
}