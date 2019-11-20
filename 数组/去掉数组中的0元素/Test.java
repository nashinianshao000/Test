public class Test{
	public static void main(String[]args){
		int[] array={1,2,3,0,0,4,5,0,6,0,7};
		int a=0;
		for(int x:array){
			if(x>0){
				a=a+1;
			}
		}
		int[] x=new int[a];
		int z=0;
		for(int y=0;y<array.length;y++){
			if(array[y]>0){
				x[z]=array[y];
				z++;
			}
		}
		for(int e:x){
			System.out.println(e);
		
		}

	}	
}