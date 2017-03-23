package cc.openhome;

public class Hare implements Runnable {
	private boolean[] flags = {true,false};
	private int totalStep;
	private int step;
	public Hare(int totalStep){
		this.totalStep = totalStep;
	}
	
	@Override
	public void run() {
		while(step<totalStep){
			boolean isHareSleep = flags[((int)(Math.random()*10)) %2];
			if(isHareSleep){
				System.out.println("�ߤl�εۤF zzzz");
			}else{
				step += 2;
				System.out.printf("�ߤl�]�F %d �B...%n", step);
			}
		}

	}

}
