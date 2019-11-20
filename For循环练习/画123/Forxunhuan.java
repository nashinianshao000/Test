public class Forxunhuan{
	public static void main(String[]args){
		
		for(int x = 1;x<=4;x++){
			for(int e = 1;e<=4-x;e++){
				for(int h = (x-1);h>=0;h--){
					for(int z = 1;z<=x;z++){
						for(int y = 1;y<=4-x;y++){
							System.out.print("0");
						}

						System.out.print(z);
					}

					System.out.print(h);
				}
				System.out.print("0");
			}			
			System.out.println();
		}
	}
}
