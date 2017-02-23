package ex04;

public class MyArray1 {

	public static void main(String[] args) {
		int [] n = new int[] {56, 45, 68, 32};
		int sum = 0;
		for(int i=0;i<4;i++){
			System.out.println("n["+ i +"] = "+ n[i]);
			sum += n[i];
		}
		System.out.println("The sum of n is "+ sum);

	}

}
