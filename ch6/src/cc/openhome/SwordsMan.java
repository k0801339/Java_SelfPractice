package cc.openhome;

public class SwordsMan extends Role{
	@Override
	public void fight(){
		System.out.println("���C����");
	}
	
	public String toString(){
		return "�C�h " + super.toString();
	}
}
