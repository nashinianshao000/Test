public class Test{
	public static void main(String[]args){
		int[] array={1,2,3,9,4,5};
		int[] x=new int[3];
		int[] y=new int[2];
		int max=array[0];
		for(int i:array){
			if(i>max){
				max=i;
			}
		}
		for(int i=0;i<array.length;i++){
			if(array[i]<max){
				x[i]=array[i];
			}else{
				break;
			}	
		}
		for(int j=0;j<array.length-x.length;j++){
			y[j]=array[j+x.length+1];
}
		for(int i:x){
			System.out.println(i);
		}
		for(int j:y){
			System.out.println(j);			
}
	}
}