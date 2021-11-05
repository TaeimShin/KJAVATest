package evaluation;

class Banking {   
   
	String name;
	String acccountNumber;
	int balance;
	public Banking(String name, String acccountNumber, int balance)
	{
		this.name = name;
		this.acccountNumber = acccountNumber;
		this.balance = balance;
	}
	
	void deposit(int money) {
		
		System.out.println(money+"원이 입금됨");
		this.balance += money;
	}
	void withdraw(int money) {
		System.out.println("계좌에서 " + money+ "원이 출금됨");
		this.balance -= money;
	}
	void showAccount() {
		System.out.println("계좌주:"+name);
		System.out.println("계좌번호:"+ acccountNumber);
		System.out.println("잔고:" +this.balance);
	}
}

public class BankingMain {
    public static void main(String[] args) {
        Banking banking = new Banking("장동건", "123-45-67890", 10000);
        banking.deposit(5000);
        banking.withdraw(9000);
        banking.showAccount();
    }
}