package ex05;
import java.util.Scanner;
public class Guess {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int number = (int)(Math.random()*10);
		int guess;
		do{
			System.out.print("Guess the number(0~9): ");
			guess = console.nextInt();
		}while(guess!=number);
		System.out.println("Oh Ya~");
	}
}
