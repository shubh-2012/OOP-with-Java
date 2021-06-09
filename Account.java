package account;

class Account1{
	private String id;
	private int balance=0;
	private String name;

	
	public Account1(String id,String name) {
		this.id=id;
		this.name=name;
	}
	public Account1(String id,String name,int balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	public String getId() {
		return id;
	}
	public int getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
	
	public int credit(int amount) {
		this.balance=balance+amount;
		return balance;
	}
	public int debit(int amount) {
		if(balance>amount) {
		this.balance=balance-amount;
		}
		else System.out.println( "Amount Exceeded Balance");
		return balance;
	}
	public int transferTo(Account1 account,int amount) {
		if(amount<= balance) {
			this.balance=balance-amount;
			account.balance+=amount;
		}
		else System.out.println( "Amount Exceeded Balance");
		return balance;
	}
	
	public String toString() {
		return "Account[id="+id+","+"name="+name+","+"balance="+balance+"]";
	}
}
public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account1 a1 = new Account1("A101", "Tan Ah Teck", 88);
	      System.out.println(a1);  // toString();
	      Account1 a2 = new Account1("A102", "Kumar"); // default balance
	      System.out.println(a2);

	      // Test Getters
	      System.out.println("ID: " + a1.getId());
	      System.out.println("Name: " + a1.getName());
	      System.out.println("Balance: " + a1.getBalance());

	      // Test credit() and debit()
	      a1.credit(100);
	      System.out.println(a1);
	      a1.debit(50);
	      System.out.println(a1);
	      a1.debit(500);  // debit() error
	      System.out.println(a1);

	      // Test transfer()
	      a1.transferTo(a2, 100);  // toString()
	      System.out.println(a1);
	      System.out.println(a2);
	}

}
