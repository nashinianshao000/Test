import java.util.Scanner;

public class Test{
	public static void main(String[]args){
		String[] yonghuming={"����","��h","С��"};
		int[] mima={123,456,789};
		Scanner input=new Scanner(System.in);
		System.out.println("�������û���");
		String a=input.nextLine();
		System.out.println("����������");
		int b=input.nextInt();
		boolean y=false;
			for(int x=0;x<yonghuming.length;x++){
				if(yonghuming[x].equals(a)){
					if(mima[x]==b){
						System.out.println("��¼�ɹ�");
						y=true;	
					}
					break;
				}
			}
			if(y==false){
				System.out.println("�û������������");
			}		
	}
}