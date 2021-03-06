package cc.openhome;

public class SampleLinkedList {
	/**
	 * @author  �ե�
	 */
	private class Node{
		Node(Object o){
			this.o = o;
		}
		Object o;
		/**
		 * @uml.property  name="next"
		 * @uml.associationEnd  
		 */
		Node next;
	}
	/**
	 * @uml.property  name="first"
	 * @uml.associationEnd  inverse="this$0:cc.openhome.SampleLinkedList$Node"
	 */
	private Node first;
	public void add(Object elem){
		Node node = new Node(elem);
		if(first==null)	first = node;
		else	append(node);
	}
	private void append(Node node){
		Node last = first;
		while(last.next!=null){
			last = last.next;
		}
		last.next = node;
	}
	public int size(){
		int count = 0;
		Node last = first;
		while(last!=null){
			last = last.next;
			++count;
		}
		return count;
	}
	public Object get(int idx){
		checkSize(idx);
		return findElemOf(idx);
	}
	private void checkSize(int idx) throws IndexOutOfBoundsException{
		int size = size();
		if(idx>=size){
			throw new IndexOutOfBoundsException(
					String.format("Idx: %d, Size: %d", idx, size));
		}
	}
	private Object findElemOf(int idx){
		int count = 0;
		Node last = first;
		while(count<idx){
			last = last.next;
			++count;
		}
		return last.o;
	}
	
}
