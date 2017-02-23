package Overload;

class Cmath{
	public int getMax(int a, int b){
		if(a>b)	return a;
		else	return b;
	}
	public int getMax(int[] vArray){
		int n = vArray[0];
		for(int i=1;i<vArray.length;i++){
			if(vArray[i]>n)	n = vArray[i];
		}
		return n;
	}
}

public class Overload {
	public static void main(String[] args){
		Cmath max1 = new Cmath();
		System.out.println("The max of 10 and 20 is:"+max1.getMax(10, 20));
		int[] ary = new int[] {52,66,78,99,11};
		System.out.println("In array{52,66,78,99,11}, the max is:"+max1.getMax(ary));
		
	}

}
