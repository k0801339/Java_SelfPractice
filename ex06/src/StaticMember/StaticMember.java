package StaticMember;

class Cstudent{
	private static int num;
	public int weight, height;
	public Cstudent(){
		num++;
	}
	public Cstudent(int w, int h){
		num++;
		weight = w;
		height = h;
	}
	public static void getObjectNum(){
		System.out.println("Now, class Cstudent makes "+num+" object.\n");
	}
}

public class StaticMember {

	public static void main(String[] args) {
		Cstudent Peter = new Cstudent();
		Peter.weight = 65;
		Peter.height = 165;
		System.out.println("Peter's weight ="+Peter.weight
							+ "\theight ="+Peter.height);
		Cstudent.getObjectNum();
		Cstudent David = new Cstudent(58,170);
		System.out.println("David's weight ="+David.weight
				+ "\theight ="+David.height);
		David.getObjectNum();

	}

}
