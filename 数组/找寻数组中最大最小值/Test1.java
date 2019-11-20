public class Test1{
	public static void main(String[]args){
		int[] array={1,3,5,7,9,0,2,4,6,8};
		int x =array[0];
		int y =array[0];
		for(int z:array){
			if(z>x){
				x=z;
			}
			if(z<y){
				y=z;
			}
		}
			System.out.println(x);
			System.out.println(y);
	}
}