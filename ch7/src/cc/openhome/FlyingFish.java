package cc.openhome;

public class FlyingFish extends Fish implements Flyer {
	public FlyingFish(String name){
		super(name);
	}
	@Override
	public void swim(){
		System.out.printf("飛魚游泳");
	}
	@Override
	public void fly(){
		System.out.printf("飛魚會飛");
	}
}
