public class Forxunhuantwo{
	public static void main(String[]args){
		for(int x = 2;x<=100;x++){
			boolean z=false;
			for(int y = 2;y <=x-1;y++){
				if(x%y==0){
					System.out.println(x+"不是质数");
					z = true;
					break;
				}
			}
				if(z==false){
					System.out.println(x+"是质数");
				}
		}
	}
} 