package cc.openhome;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class ImportStatic {

	public static void main(String[] args) {
		Scanner console = new Scanner(in);
		out.print("Enter your name: ");
		out.printf("%s welcome!%n", console.nextLine());
		out.println(MathTool.sum(1,2,4));
	}

}
