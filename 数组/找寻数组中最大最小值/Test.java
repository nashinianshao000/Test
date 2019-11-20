public class Test{
	public static void main(String[]args){
		int[] array={1,3,5,7,9,0,2,4,6,8};
		int y =0;
		int z =0;
		for(int x:array){
			if(x>y){
				y=x;
			}
		}
		for(int x:array){
			if(x<z){
				z=x;
			}
		}
			System.out.println(y);
			System.out.println(z);
	}
}
		