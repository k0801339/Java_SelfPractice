package ex04;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = {83,25,31,5,52,17,42,63,11,9};
		System.out.print("Before sorting:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+", ");
		System.out.println();
		Arrays.sort(arr);
		System.out.print("After sorting:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+", ");
		System.out.println();
		System.out.print("Enter the value you want to search:");
		int sNum = scn.nextInt();
		int find = -1;
		if((find = Arrays.binarySearch(arr, sNum))>-1)
			System.out.println("No."+find+" is "+sNum);
		else
			System.out.println("Cannot find "+sNum);
		scn.close();

	}

}
