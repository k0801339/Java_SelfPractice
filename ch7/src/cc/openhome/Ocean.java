package cc.openhome;

public class Ocean {

	public static void main(String[] args) {
		doSwim(new Anemonefish("����"));
		doSwim(new Human("�봵��"));
		doSwim(new Seaplane("Zero"));
		doSwim(new FlyingFish("Peace"));
	}
	static void doSwim(Swimmer swimmer){
		swimmer.swim();
	}

}
