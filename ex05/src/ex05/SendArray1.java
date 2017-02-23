package ex05;

public class SendArray1 {

	public static void main(String[] args) {
		int[] myArray = new int[] {31,12,16,10,78};
		System.out.print("Before sorting:");
		for(int i=0;i<myArray.length;i++)
			System.out.print(" "+myArray[i]);
		bubbleSort(myArray);
		System.out.println();
		System.out.print("After sorting:");
		for(int i=0;i<myArray.length;i++)
			System.out.print(" "+myArray[i]);

	}
	static void bubbleSort(int[] vArray){
		int tmp = 0;
		for(int i=vArray.length-1;i>=0;i--){
			for(int j=0;j<i;j++){
				if(vArray[j]>vArray[j+1]){
					tmp = vArray[j];
					vArray[j] = vArray[j+1];
					vArray[j+1] = tmp;
				}
			}
		}
	}
}
