package cc.openhome;

public class Ex2 {
	
	public static void main(String[] args){
		int[][] cards = new int[4][13];
		for(int i=0;i<52;i++){
			int choose, num;
			do{
				choose = (int)(Math.random()*4);
				num = (int)(Math.random()*13);
			}while(cards[choose][num]!=0);
			cards[choose][num] = 1;
			switch(choose){
			case 0:
				System.out.print("®ç ");
				break;
			case 1:
				System.out.print("¤ß ");
				break;
			case 2:
				System.out.print("¿j ");
				break;
			case 3:
				System.out.print("±ö ");
				break;
			}
			
			System.out.printf("%2d ", num+1);
			if((i+1)%13==0)	System.out.println();
		}
	}
	
}
