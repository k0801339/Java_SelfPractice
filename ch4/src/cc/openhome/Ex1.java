package cc.openhome;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.print("求幾個費式數? ");
		int num = console.nextInt();
		int pre1 = 0, pre2 = 1;
		for(int i=0;i<num;i++){
			if(i==0||i==1){
				System.out.printf("%d ", i);
			}else{
				int tmp = pre2;
				System.out.printf("%d ", pre1+pre2);
				pre2 += pre1;
				pre1 = tmp;
			}
		}
	}
}
