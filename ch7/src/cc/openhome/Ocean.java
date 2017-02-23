package cc.openhome;

public class Ocean {

	public static void main(String[] args) {
		doSwim(new Anemonefish("¥§²ö"));
		doSwim(new Human("¸ë´µ¥Å"));
		doSwim(new Seaplane("Zero"));
		doSwim(new FlyingFish("Peace"));
	}
	static void doSwim(Swimmer swimmer){
		swimmer.swim();
	}

}
