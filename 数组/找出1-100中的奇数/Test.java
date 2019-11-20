public class Test{
	public static void main(String[]args){
		int[] array=new int[50];
		for(int value=0;value<array.length;value++){
			array[value]=value*2+1;		
		}
		for(int x:array){
			System.out.println(x);

		}	
	}
}