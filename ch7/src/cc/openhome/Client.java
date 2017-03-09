package cc.openhome;

public class Client {
	/**
	 * @uml.property  name="ip"
	 */
	public final String ip;
	/**
	 * @uml.property  name="name"
	 */
	public final String name;
	public Client(String ip, String name){
		this.ip = ip;
		this.name = name;
	}
	
}
