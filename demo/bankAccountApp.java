package demo;

public class bankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		bankAccount acc1 = new bankAccount();
		bankAccount acc2 = new bankAccount("Checking Account");
		bankAccount acc3 = new bankAccount("Savings Account", 5000);
		System.out.println("Account number 2 is a " + acc2.accountType);
		acc3.checkBalance();
	*/
		
		//CDAccount cd1 = new CDAccount();
		
		//cd1.name = "Roger";
		//cd1.accountNumber = "123456";
		//cd1.balance = 1000.00;
		
		//System.out.println(cd1.toString());
		bankAccount acc3 = new bankAccount("Savings Account", 5000);
		acc3.setName("Roger");
		System.out.println(acc3.getName());
		acc3.setSsn("123456789");
		System.out.println(acc3.getSsn());
	}

}
