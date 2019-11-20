public class Forxunhuanfor{
	public static void main(String[]args){
		for(int x =1;x<=4;x++){
			for(int y = 1;y<=7;y++){
				if(x==2&&y==4){
				System.out.print("#");
				}
				else if(x==3&&(y==3||y==4||y==5)){
				System.out.print("#");
				}
				else if(x==4&&(y==2||y==3||y==4||y==5||y==6)){
				System.out.print("#");
				}
				else{System.out.print("*");}
			}
		System.out.println(" ");
		}
	}
}