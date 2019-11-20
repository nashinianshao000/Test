public class Test{
	public static void main(String[]args){
		int[] array=new int[50];
		for(int i=0;i<array.length;i++){
			array[i]=2*i+2;
		}
		for(int j:array){
			System.out.println(j);		
		}
	}
}