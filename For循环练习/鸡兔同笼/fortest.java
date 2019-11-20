public class Fortest{
	public static void main(String[]args){
		for(int x = 1;x<50;x++){
			if(2*x+4*(50-x)==160){
				System.out.println("鸡的数量为："+x);
				System.out.println("兔子的数量为："+(50-x));
			}
		}
	}
}