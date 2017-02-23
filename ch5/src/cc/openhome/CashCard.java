package cc.openhome;

class CashCard{
	String number;
	int balance;
	int bonus;
	CashCard(String number, int balance, int bonus){
		this.number = number;
		this.balance = balance;
		this.bonus = bonus;
	}
	void store(int money){
		if(money>0){
			this.balance += money;
			if(balance>=1000)	this.bonus++;
		}else	System.out.println("儲值是負的???");
	}
	void charge(int money){
		if(money>0){
			if(money<=this.balance)	this.balance -= money;
			else	System.out.println("錢不夠啊!!");
		}else	System.out.println("儲負數??");
	}
	int exchange(int bonus){
		if(bonus>0)	this.bonus -= bonus;
		return this.bonus;
	}
}
