package cc.openhome;

public class Seaplane implements Swimmer, Flyer{
	/**
	 * @uml.property  name="name"
	 */
	private String name;
	public Seaplane(String name){
		this.name = name;
	}
	@Override
	public void fly(){
		System.out.printf("���W����  %s �b��%n", name);
	}
	@Override
	public void swim(){
		System.out.printf("���W����  %s ������%n", name);
	}
}
