package ex02;

public class ex02_04 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("a = " +a);
		int b = a++;
		System.out.println("a = " +a+ ", b = " +b);
		b = ++a;
		System.out.println("a = " +a+ ", b = " +b);
		b = a--;
		System.out.println("a = " +a+ ", b = " +b);
		b = --a;
		System.out.println("a = " +a+ ", b = " +b);
	}

}
