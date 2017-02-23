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
		}else	System.out.println("�x�ȬO�t��???");
	}
	void charge(int money){
		if(money>0){
			if(money<=this.balance)	this.balance -= money;
			else	System.out.println("��������!!");
		}else	System.out.println("�x�t��??");
	}
	int exchange(int bonus){
		if(bonus>0)	this.bonus -= bonus;
		return this.bonus;
	}
}
