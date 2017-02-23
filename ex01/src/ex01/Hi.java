package ex01;

import java.util.Scanner;

/** This is the main class */

public class Hi {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String strName = scn.next();
		System.out.println("Hi! "+strName+", welcome to Java world!");
		scn.close();
	}

}
