package ex04;

public class BubbleSort {

	public static void main(String[] args) {
		int [] aNum = {32, 24, 11, 48, 15};
		System.out.print("Before sorting:");
		for(int i=0;i<aNum.length;i++)
			System.out.print(" "+aNum[i]);
		System.out.println();
		int n = aNum.length, tmp;
		for(int i=n-2;i>=0;i--){
			for(int j=0;j<=i;j++){
				if(aNum[j]>aNum[j+1]){
					tmp = aNum[j];
					aNum[j] = aNum[j+1];
					aNum[j+1] = tmp;
				}
			}
			System.out.print(" No."+(4-i)+" cycle:");
			for(int k=0;k<aNum.length;k++)
				System.out.print(" "+aNum[k]);
			System.out.println();
		}
		System.out.print("After sorting:");
		for(int i=0;i<aNum.length;i++)
			System.out.print(" "+aNum[i]);

	}

}
