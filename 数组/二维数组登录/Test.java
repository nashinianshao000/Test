import java.util.Scanner;

public class Test{
	public static void main(String[]args){
		String[][] a={{"����","123"},{"��h","456"},{"С��","789"}};	
		Scanner input=new Scanner(System.in);
		System.out.println("�������˺���");
		String zhanghaoming=input.nextLine();
		System.out.println("����������");
		String mima=input.nextLine();
		boolean z=false;
		for(int x=0;x<a.length;x++){
			if(zhanghaoming.equals(a[x][0])){
				if(mima.equals(a[x][1])){
					System.out.println("��¼�ɹ�");
					z=true;
				}
				break;
			}
		}
		if(!z){
			System.out.println("��¼�����������");
		}
	}
} 