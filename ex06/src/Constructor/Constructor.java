package Constructor;

class Cstudent{
	private int height = 150;
	private int weight = 40;
	private void setWeight(int w){
		if(w>=40 && w<=150)	weight = w;
	}
	private void setHeight(int h){
		if(h>=50 && h<=250)	height = h;
	}
	public Cstudent() {}
	public Cstudent(int w){
		setWeight(w);
	}
	public Cstudent(int h, int w){
		setHeight(h);
		setWeight(w);
	}
	public void getShow(){
		System.out.println(" The height is:"+height);
		System.out.println(" The weight is:"+weight+"\n");
	}
}

public class Constructor {

	public static void main(String[] args) {
		Cstudent Peter = new Cstudent();
		System.out.println("Peter's file --> using Cstudent() constructor");
		Peter.getShow();
		Cstudent David = new Cstudent(300);
		System.out.println("David's file --> using Cstudent() constructor");
		David.getShow();
		Cstudent Mary = new Cstudent(180,78);
		System.out.println("Mary's file --> using Cstudent() constructor");
		Mary.getShow();

	}

}
