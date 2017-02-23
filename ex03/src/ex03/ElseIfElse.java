package ex03;
import java.util.Scanner;
public class ElseIfElse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter one character:");
		char c = scn.next().charAt(0);
		if(Character.isDigit(c))
			System.out.println("Number!");
		else if(Character.isUpperCase(c))
			System.out.println("Upper word!");
		else if(Character.isLowerCase(c))
			System.out.println("Lower word!");
		else
			System.out.println("Other!");
		scn.close();

	}

}
