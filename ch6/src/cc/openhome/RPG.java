package cc.openhome;

public class RPG {

	public static void main(String[] args) {
		SwordsMan swordsMan = new SwordsMan();
		swordsMan.setName("Justin");
		swordsMan.setLevel(1);
		swordsMan.setBlood(200);
		
		Magician magician = new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		
		System.out.println(swordsMan.toString());
		System.out.println(magician.toString());
		
		drawFight(swordsMan);
		drawFight(magician);

	}
	
	static void showBlood(Role role){
		System.out.printf("%s ¦å¶q  %d%n", role.getName(), role.getBlood());
	}
	static void drawFight(Role role){
		System.out.print(role.getName() + " ");
		role.fight();
	}

}
