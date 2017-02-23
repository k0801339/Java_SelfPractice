package cc.openhome;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		int[] number = {1,10,31,33,37,48,60,70,80};
		Scanner console = new Scanner(System.in);
		int guess, idx = -1;
		guess = console.nextInt();
		for(int i=0;i<number.length;i++){
			if(guess==number[i]){
				idx = i;
				break;
			}
		}
		System.out.println(idx);
	}

}
