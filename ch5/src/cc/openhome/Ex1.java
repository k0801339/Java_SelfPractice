package cc.openhome;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int number = console.nextInt();
		Hanoi(number,1,3,2);
	}
	public static void Hanoi(int n, int from, int to, int buf){
		if(n==0)	return;
		Hanoi(n-1,from,buf,to);
		System.out.printf("%d: %d -> %d%n", n, from, to);
		Hanoi(n-1,buf,to,from);
	}
}
