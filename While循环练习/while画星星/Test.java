public class Test{
	public static void main(String[]args){
		int x = 1;
		while(x<=4){
			int y = 1;	
			while(y<=4-x){
				System.out.print(" ");
				y++;
			}		
			int z = 1;
			while(z<=2*x-1){
				System.out.print("*");
				z++;
			}

			System.out.println();
			x++;
		}
	}	
}