package Encapsulate;
class Ccar{
	private double gas, tbo;
	private double max_dist = 0;
	
	private void MaxDist(){
		max_dist = gas * tbo;
	}
	
	public void SetValue(double g, double t){
		gas = g;
		tbo = t;
		MaxDist();
	}
	
	public double GetDist(){
		return max_dist;
	}
}
public class Encapsulate {
	public static void main(String[] args){
		Ccar car1 = new Ccar();
		double g1 = 40.7, t1 = 13.6;
		car1.SetValue(g1, t1);
		double distance1 = car1.GetDist();
		Ccar car2 = new Ccar();
		car2.SetValue(60, 9.5);
		System.out.println("With full oil car1 can drive "+distance1+" km");
		System.out.println("With full oil car2 can drive "+car2.GetDist()+" km");
	}
}
