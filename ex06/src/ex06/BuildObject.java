package ex06;

public class BuildObject {

	public static void main(String[] args) {
		Ccar car1;
		car1 = new Ccar();
		car1.gas = 40.7;
		car1.tbo = 13.6;
		car1.MaxDist();
		double distance = car1.Dist(10);
		
		Ccar car2 = new Ccar();
		car2.gas = 60;
		car2.tbo = 9.5;
		
		System.out.println("The information of car1:");
		System.out.println("Max oil:"+car1.gas+" L");
		System.out.println("Average oil consumption:"+car1.tbo+" km/L");
		System.out.println("With full oil can drive "+car1.max_dist+" km");
		System.out.println("With 10L oil can drive "+distance+" km");
		
	}

}
