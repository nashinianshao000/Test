public class Forxunhuan{
	public static void main(String[]args){
		for(int x = 2;x<=100;x++){
			int y = 2;
			for(;y<=x-1;y++){
				if(x%y==0){
					System.out.println(x+"不是质数");	
					break;			
				}
			}
				if(y==x){
				System.out.println(x+"是质数");
				}
		}

	}
}