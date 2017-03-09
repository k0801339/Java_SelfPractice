package cc.openhome;

import java.util.Scanner;

public class Average3 {

	public static void main(String[] args) {
			double sum = 0;
			int count = 0;
			while(true){
				int num = nextInt();
				if(num==0){
					break;
				}
				sum += num;
				++count;
			}
			System.out.printf("Ave: %.2f%n", sum/count);
	}
	static Scanner console = new Scanner(System.in);
	static int nextInt(){
		String input = console.next();
		while(!input.matches("\\d*")){
			System.out.println("Enter the number!");
			input = console.next();
		}
		return Integer.parseInt(input);
	}

}
