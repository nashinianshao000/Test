import java.util.Scanner;

public class Test{
	public static void main(String[]args){
		int[][] a=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		Scanner input=new Scanner(System.in);		
		System.out.println("请输入一个周数");
		int x=input.nextInt();
		for(int y=1;y<=x;y++){
			int[] b=a[0];
			a[0]=a[1];
			a[1]=a[2];
			a[2]=a[3];
			a[3]=b;
		}
			for(int[] i:a){
				for(int j: i){
					System.out.println(j);
				}		
			}	
	}
}