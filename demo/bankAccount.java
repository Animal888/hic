package demo;

public class bankAccount {
	
	String accountNumber;
	String routeNumber;
	String accountType;
	private String name;
	private String ssn;
	double balance = 0;
	bankAccount() {
		System.out.println("New Account Created");
	}
	
	bankAccount(String accT) {
		accountType = accT;
	}
	
	bankAccount(String accT, double initDeposit) {
		accountType = accT;
		String msg = null;
		if(initDeposit < 1000) {
			msg = "The minimum deposit is $1000.00";
		} else {
			msg = "Thank you for your deposit of : $" + initDeposit;
		}
		System.out.println(msg);
		balance += initDeposit;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	void withdraw() {
		
	}
	
	void deposit() {
	
	}

	void checkBalance() {
		System.out.println("Your balance is : $" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ " + name + " " + accountNumber + " balance " + balance + " ]"; 
	
	}
	
}
