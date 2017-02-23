package ex03;
import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = 1;
		int sum = 0;
		String numLine = "";
		while(num!=0){
			System.out.print("Enter the sum:(If 0 over)");
			num = scn.nextInt();
			sum += num;
			numLine += (num);
			if(num!=0)	numLine += ("+");
		}
		System.out.println(numLine+" = "+sum);
		scn.close();

	}

}
