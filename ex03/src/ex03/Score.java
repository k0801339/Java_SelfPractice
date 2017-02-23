package ex03;
import java.util.Scanner;
public class Score {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char grade;
		System.out.print("Enter the test score:");
		int score = scn.nextInt();
		score /= 10;
		switch(score){
		case 10:
		case 9:
		case 8:
			grade = 'A';
			break;
		case 7:
			grade = 'B';
			break;
		case 6:
			grade = 'C';
			break;
		default:
			grade = 'F';
		}
		System.out.println("This is "+grade+" class grade.");
		scn.close();

	}

}
