public class Forxunhuantwo{
	public static void main(String[]args){
		for(int x=1;x<=4;x++){
			if(x==1){
				for(int y=1;y<=3;y++){
					System.out.print("*");
				}
					System.out.print("1");
			}else{
				for(int y = 1;y<=4-x;y++){
					System.out.print("*");
					}
				for(int z = 1;z<=x;z++){
					System.out.print(z);	
				}
				
				for(int y = x-1;y>0;y--){
					System.out.print(y);
				}
			}
			System.out.println();
		}
	}
}