package cc.openhome;

import java.util.ArrayList;

public class ClientQueue {
	/**
	 * @uml.property  name="clients"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="cc.openhome.Client"
	 */
	private ArrayList clients = new ArrayList();
	/**
	 * @uml.property  name="listeners"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="cc.openhome.ClientListener"
	 */
	private ArrayList listeners = new ArrayList();
	
	public void addClientListener(ClientListener listener){
		listeners.add(listener);
	}
	public void add(Client client){
		clients.add(client);
		ClientEvent event = new ClientEvent(client);
		for(int i=0;i<listeners.size();i++){
			ClientListener listener = (ClientListener)listeners.get(i);
			listener.clientAdded(event);
		}
	}
	public void remove(Client client){
		clients.remove(client);
		ClientEvent event = new ClientEvent(client);
		for(int i=0;i<listeners.size();i++){
			ClientListener listener = (ClientListener)listeners.get(i);
			listener.clientRemoved(event);
		}
	}
	
}
