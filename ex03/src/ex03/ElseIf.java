package ex03;
import java.util.Scanner;
public class ElseIf {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String id, pass;
		System.out.print("Enter the ID:");
		id = scn.next();
		System.out.print("Enter the password:");
		pass = scn.next();
		if(id.equals("Love") && pass.equals("2520")){
			System.out.println("Right!");
			System.out.println("Welcome to the system!");
		}else{
			System.out.println("Wrong!");
			System.out.println("You cannot enter the system!");
		}
		scn.close();

	}

}
