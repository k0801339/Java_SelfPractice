package ex05;

public class Method2 {
	public static void main(String[] args){
		int tol1, tol2;
		tol1 = sum(1,10);
		System.out.println("The sum from 1 to 10 is "+tol1+"\n");
		tol2 = sum(5,12);
		System.out.println("The sum from 5 to 12 is "+tol2+"\n");
	}
	
	static int sum(int vStart, int vEnd){
		int total = 0;
		for(int i=vStart;i<=vEnd;i++)
			total += i;
		return total;
			
	}
}
