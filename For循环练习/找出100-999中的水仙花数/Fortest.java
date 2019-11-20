public class Fortest{
	public static void main(String[]args){
		for(int x = 100;x < 1000;x++){
			if(Math.pow(x/100,3)+Math.pow(x%100/10,3)+Math.pow(x%10,3)==x){
				System.out.println(x+"是水仙花数");
			}
		}
	}
}