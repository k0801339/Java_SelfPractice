package cc.openhome;

public class FlyingFish extends Fish implements Flyer {
	public FlyingFish(String name){
		super(name);
	}
	@Override
	public void swim(){
		System.out.printf("������a");
	}
	@Override
	public void fly(){
		System.out.printf("�����|��");
	}
}
