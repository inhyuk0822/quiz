package quiz03;

public class Account {

	String name;
	String password;
	int balance;
	
	Account(String n, String pw, int bal) {
		name = n;
		password = pw;
		balance = bal;
	}
	
	
	void deposit(int money) {
		balance += money;
		
	}
	
	void withDraw(int money) {
		balance -= money;
		
	}
	
	int getBalance() {
		
		return balance;
		
	}
	
	
	
	
	
	
}
