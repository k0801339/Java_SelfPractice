package cc.openhome;

public abstract class GuessGame {
	public void go(){
		int number = (int)(Math.random()*10);
		int guess;
		do{
			print("Enter the number: ");
			guess = nextInt();
		}while(guess!=number);
		println("Right!");
	}
	public void println(String text){
		print(text + "\n");
	}
	public abstract void print(String text);
	public abstract int nextInt();
}
