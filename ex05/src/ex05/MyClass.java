package ex05;

public class MyClass {
	void add(int x, int y){
		System.out.print("The method to use MyClass's add-->");
		System.out.println(x+" + "+y+" = "+(x+y));
	}
	public static void main(String[] args){
		int a = 20;
		MyClass c1 = new MyClass();
		c1.add(a+5, 3);
		MyCal c2 = new MyCal();
		c2.add(a-7, 2);
	}

}
class MyCal{
	void add(int x, int y){
		System.out.print("The method to use MyCal's add-->");
		System.out.println(x+" + "+y+" = "+(x+y));
	}
}
