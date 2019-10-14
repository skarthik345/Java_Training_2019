package assesment_3;

public class Account {
	private int accountNumber;
	private int balance;
	static private int totalAccounts;
	
	public Account(int accountNumber, int balance) {
		totalAccounts++;
		this.accountNumber = accountNumber;
		this.balance = balance;
		;
	}
	
	public void deposit(int amount) {
		try{
			if(amount<0)
				throw new DepositException();	
			else
				this.balance=this.balance+amount;
		}
		catch(DepositException de){
			de.printStackTrace();
		}
		finally {
		System.out.println("The updated balance is "+this.balance);
		}
	}
	public void withdraw(int amount) {
		try{
			if(this.balance-amount<0)
				throw new WithdrawException();
			else
				this.balance=this.balance-amount;
		}
		catch(WithdrawException we){
			we.printStackTrace();
		}
		finally {
			System.out.println("The final balance is "+this.balance);
		}
	}
	
		@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

		public static void main(String[] args) {
			Account a1 = new Account(111, 100);
			Account a2 = new Account(222, 200);
			Account a3 = new Account(333, 100);
			a1.deposit(200);
			a2.withdraw(300);
			a3.deposit(-100);
			System.out.println("The total no. of accounts are "+totalAccounts);
		}
}