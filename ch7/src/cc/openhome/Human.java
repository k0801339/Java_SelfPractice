package cc.openhome;

public class Human implements Swimmer{
	/**
	 * @uml.property  name="name"
	 */
	private String name;
	public Human(String name){
		this.name = name;
	}
	/**
	 * @return
	 * @uml.property  name="name"
	 */
	public String getName(){
		return this.name;
	}
	@Override
	public void swim(){
		System.out.printf("¤HÃþ %s ´åªa%n", name);
	}
}
