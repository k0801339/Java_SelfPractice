package ex02;

import java.util.Scanner;

public class ex02_14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = scn.next();
		System.out.print("Enter your age:");
		int age = scn.nextInt();
		System.out.printf("%s Welcome! Your age is %d!\n", name, age);
		System.out.print("Enter your motto:");
		String mot;
		while((mot = scn.nextLine()).equals(""));
		System.out.println("Your motto is "+mot);
		scn.close();
	}

}
