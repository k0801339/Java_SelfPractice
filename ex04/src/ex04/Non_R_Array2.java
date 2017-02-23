package ex04;
import java.util.Scanner;
public class Non_R_Array2 {

	public static void main(String[] args) {
		String [] q_array = new String[] {"Name","Address","Tel"};
		char [][] a_array = new char[q_array.length][];
		Scanner scn = new Scanner(System.in);
		String str;
		for(int num=0;num<q_array.length;num++){
			System.out.print("Enter "+q_array[num]+":");
			str = scn.nextLine();
			a_array[num] = new char[str.length()];
			for(int i=0;i<str.length();i++)
				a_array[num][i] = str.charAt(i);
		}
		System.out.println("The information you enter:");
		for(int i=0;i<q_array.length;i++){
			System.out.print(q_array[i]+":");
			for(int j=0;j<a_array[i].length;j++)
				System.out.print(a_array[i][j]);
			System.out.println();
		}
		scn.close();
		
	}

}
