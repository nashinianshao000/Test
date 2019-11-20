public class Test{
	public static void main(String[]args){
		int[] a={5,2,3,8,9,4,1};
		for(int x=1;x<=a.length-1;x++){
			for(int y=a.length-1;y>=x;y--){
				if(a[y]<a[y-1]){
					int z=a[y-1];
					a[y-1]=a[y];
					a[y]=z;
					
				}
			}
		}
		for(int i:a){
			System.out.print(i);
		}
	}
}