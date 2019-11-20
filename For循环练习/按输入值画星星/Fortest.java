import java.util.Scanner;

public class Fortest{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个行数");
		int line=input.nextInt();
		for(int x = 1;x<=line;x++){
			if(x==1){
				for(int y = 1;y<=(2*line-1);y++){
					System.out.print("*");	
				}
			}else{
				for(int z = 1;z<=(line+1)-x;z++){
					System.out.print("*");
				}
				for(int z = 1;z<=2*x-3;z++){
					System.out.print(" ");
				}
				for(int z = 1;z<=(line+1)-x;z++){
					System.out.print("*");
				}			
			}
			System.out.println();
		}
	}
}