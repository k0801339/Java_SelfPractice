package cc.openhome;

import java.util.*;

public class Average2 {

	public static void main(String[] args) {
		try{
			Scanner console = new Scanner(System.in);
			double sum = 0;
			int count = 0;
			while(true){
				int num = console.nextInt();
				if(num==0)	break;
				sum += num;
				count++;
			}
			System.out.printf("Ave: %.2f%n", sum/count);
			console.close();
		} catch(InputMismatchException ex){
			System.out.println("Please input integer");
		}
	}

}
