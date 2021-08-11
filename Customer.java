package advncJava;

public class Customer implements Cloneable {

	public String name = null;

	public BankAccount account = null;

	public CustomerAddress address = null;
	
	public Customer(String n) {
		name = n;
	account = new BankAccount(200);
		address = new CustomerAddress();

	}

	public Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (BankAccount) account.clone();
		return c;

	}

}
