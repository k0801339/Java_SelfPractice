package ex05;

public class Recursive {
	static int fib(int n){
		if(n==1||n==2)
			return 1;
		else
			return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args){
		System.out.println("Fib f(6) No.6 is "+fib(6));
		System.out.println("Fib f(10) No.10 is "+fib(10));
	}
}
