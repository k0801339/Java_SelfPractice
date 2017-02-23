package ex04;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		int [] Adata = new int[] {5, 3, 1, 2, 10, 9, 4, 8, 7, 6};
		for(int i=0;i<Adata.length;i++){
			System.out.print(" No."+(i+1)+" is "+Adata[i]);
			if(i==4||i==9)
				System.out.println();
		}
		Scanner scn = new Scanner(System.in);
		System.out.print(" Enter the number you attempt to search:");
		int searchNum = scn.nextInt();
		int num = -1;
		for(int i=0;i<Adata.length;i++){
			if(Adata[i]==searchNum){
				num = i;
				break;
			}
		}
		System.out.println(" ===================");
		if(num==-1)
			System.out.println(" Nothing-->"+searchNum);
		else
			System.out.println(" "+searchNum+" is the No."+(num+1));
		scn.close();
		
	}

}
