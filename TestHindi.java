package advncJava;

import java.util.ResourceBundle;

public class TestHindi {

	public static void main(String[] args) {
		
		ResourceBundle rsb = ResourceBundle.getBundle("advncJava.app_hi");
		
		String greeting = rsb.getString("greeting");
		String tri = rsb.getString("try");
		
		String go = rsb.getString("go");
		System.out.println(go);
		System.out.println(greeting);
		System.out.println(tri);
	}

}
