package cc.openhome;

public class Magician extends Role{
	@Override
	public void fight(){
		System.out.println("�]�k����");
	}
	public void cure(){
		System.out.println("�]�k�v��");
	}
	
	public String toString(){
		return "�]�k�v " + super.toString();
	}
}
