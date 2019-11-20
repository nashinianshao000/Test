public class Test{
	public static void main(String[]args){
		int[] x={1,2,3};
		int[] y={4,5};
		int[] z=new int[5];
		for(int i=0;i<z.length;i++){
			if(i<x.length){
				z[i]=x[i];
			}else{
				z[i]=y[i-3];
			}
		}
		for(int i:z){
			System.out.println(i);
		}
	
	}
}