public class Test1{
	public static void main(String[]args){
		int[] array={1,2,3,4,5,6};
		int y =0;
		for(int x:array){
			y=y+x;
		}
		float z =(float)y/array.length;
		System.out.println(z);
	}
}
