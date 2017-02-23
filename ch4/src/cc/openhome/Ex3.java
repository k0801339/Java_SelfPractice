package cc.openhome;

public class Ex3 {

	public static void main(String[] args) {
		int[] number = {70,80,31,37,10,1,48,60,33,80};
		//int[] ans = new int[number.length];
		for(int i=0;i<number.length-1;i++){
			for(int j=0;j<number.length-1-i;j++){
				if(number[j]>number[j+1]){
					int tmp = number[j];
					number[j] = number[j+1];
					number[j+1] = tmp;
				}
			}
		}
		for(int i:number){
			System.out.printf("%d ", i);
		}
		System.out.println();
	}

}
