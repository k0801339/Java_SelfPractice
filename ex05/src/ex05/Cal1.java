package ex05;

public class Cal1 {
	static void add(int x, int y){
		System.out.print("The method to use Cal1 class-->");
		System.out.println(x+" + "+y+" = "+(x+y));
	}
	public static void main(String[] args){
		int a = 20;
		add(a+5,3);
		Cal2.add(a-7, 2);
	}
	
}
class Cal2{
	static void add(int x, int y){
		System.out.print("The method to use Cal2 class-->");
		System.out.println(x+" + "+y+" = "+(x+y));
	}
}
