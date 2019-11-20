import java.util.Scanner;

public class Test{
	public static void main(String[]args){
		String[] yonghuming={"宫晨","孙玥","小步"};
		int[] mima={123,456,789};
		Scanner input=new Scanner(System.in);
		System.out.println("请输入用户名");
		String a=input.nextLine();
		System.out.println("请输入密码");
		int b=input.nextInt();
		boolean y=false;
			for(int x=0;x<yonghuming.length;x++){
				if(yonghuming[x].equals(a)){
					if(mima[x]==b){
						System.out.println("登录成功");
						y=true;	
					}
					break;
				}
			}
			if(y==false){
				System.out.println("用户名或密码错误");
			}		
	}
}