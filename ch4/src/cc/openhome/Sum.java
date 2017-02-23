package cc.openhome;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		long sum =0, number = 0;
		do{
			System.out.print("Enter the number: ");
			number = Long.parseLong(console.nextLine());
			sum += number;
		}while(number!=0);
		System.out.println("Total is:" + sum);
	}
}
