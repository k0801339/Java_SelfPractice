package cc.openhome;

public class ClientEvent {
	/**
	 * @uml.property  name="client"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Client client;
	public ClientEvent(Client client){
		this.client = client;
	}
	public String getName(){
		return client.name;
	}
	public String getIp(){
		return client.ip;
	}
	
}
