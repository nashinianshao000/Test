import java.util.Scanner;

public class Test{
	public static void main(String[]args){
		String[][] a={{"¹¬³¿","123"},{"Ëï«h","456"},{"Ğ¡²½","789"}};	
		Scanner input=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÕËºÅÃû");
		String zhanghaoming=input.nextLine();
		System.out.println("ÇëÊäÈëÃÜÂë");
		String mima=input.nextLine();
		boolean z=false;
		for(int x=0;x<a.length;x++){
			if(zhanghaoming.equals(a[x][0])){
				if(mima.equals(a[x][1])){
					System.out.println("µÇÂ¼³É¹¦");
					z=true;
				}
				break;
			}
		}
		if(!z){
			System.out.println("µÇÂ¼Ãû»òÃÜÂë´íÎó");
		}
	}
} 