package cc.openhome;

public abstract class Fish implements Swimmer {
	/**
	 * @uml.property  name="name"
	 */
	protected String name;
	public Fish(String name){
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
	public abstract void swim();
	
}
