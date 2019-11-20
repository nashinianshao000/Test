public class Test{
	public static void main(String[]args){
		int[] a={1,2,3,4};
		int[] b={5,6,7,8};
		/*int[] c=new int[4];
		for(int x=0;x<a.length;x++){
			c[x]=a[x];
		}
		a=b;
		b=c;
		for(int i:a){
			System.out.print(i);
		}
			System.out.println();
		for(int i:b){
			System.out.print(i);
		}*/
		int[] c=a;
		a=b;
		b=c;
			for(int i:a){
				System.out.print(i);
			}
				System.out.println();
			for(int i:b){
				System.out.print(i);
			}	


	}
}
