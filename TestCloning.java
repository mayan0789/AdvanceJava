package advncJava;

public class TestCloning {

	public static void main(String[] args) throws Exception {

		Customer c1 = new Customer("Ram");
		c1.address.city="Nepal";
		Customer c2 = (Customer) c1.clone();
		c2.name = "Balram";
		//c2.account.balance = 20;

	
		Customer c3 = (Customer) c1.clone();
		
		System.out.println("Original Object ");
		System.out.println("Name : " + c1.name);
	System.out.println("City  " + c1.address.city);
	System.out.println("Balance of Account : " + c1.account.account);
		
		System.out.println("\n--------------------------");
		System.out.println("Cloned Object");
		System.out.println("Name : " + c2.name);
		System.out.println("City  " + c2.address.city);
		System.out.println("Balance of Account : " + c2.account.account);
		
		System.out.println("\n--------------------------");
		System.out.println("Cloned Object");
		System.out.println("Name : " + c3.name);
		System.out.println("City  " + c3.address.city);
		System.out.println("Balance of Account : " + c3.account.account);
	}

}

