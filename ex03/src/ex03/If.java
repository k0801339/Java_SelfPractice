package ex03;
import java.util.Scanner;
public class If {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String vip;
		double money;
		System.out.print("Enter the cost:");
		money = scn.nextDouble();
		System.out.print("VIP or not:(Y/N)");
		vip = scn.next();
		if(vip.equals("Y")||vip.equals("y"))
			money *= 0.85;
		System.out.printf("You need to pay: %.1f", money);
		scn.close();

	}

}
