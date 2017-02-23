package cc.openhome;

class Queen{
	static int count = 0;
	static final int NQ = 8;
	int[] q = new int[NQ];
	public Queen(){
		
	}
	public void place(int row){
		if(row==NQ){
			display();
			count++;
		}else{
			for(int j=0;j<NQ;j++){
				if(valid(row,j)==1){
					q[row] = j;
					place(row+1);
				}
			}
		}
	}
	public int valid(int row, int col){
		for(int i=0;i<row;i++){
			if(q[i]==col || row-i==col-q[i] || row-i==q[i]-col)
				return 0;
		}
		return 1;
	}
	public void display(){
		for(int i=0;i<NQ;i++){
			for(int j=0;j<NQ;j++){
				if(q[i]==j)	System.out.print("@");
				else System.out.print("0");
			}
			System.out.println();
		}
		System.out.println();
	}
}

public class Ex4 {

	public static void main(String[] args) {
		Queen queen = new Queen();
		queen.place(0);
		System.out.println(Queen.count);
	}

}
