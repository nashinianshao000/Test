public class Test{
	public static void main(String[]args){
		int[] a={1,2,3,4,5,6};
		for(int x =0;x<a.length/2;x++){
			int y=a[x];
			a[x]=a[a.length-x-1];
			a[a.length-x-1]=y;
		}
		
		for(int x:a){
			System.out.print(x);
		}
	}
}