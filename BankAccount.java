package advncJava;

public class BankAccount implements Cloneable{

	public double account = 0;


	public BankAccount(double b) {
		account = b;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

	 
}
