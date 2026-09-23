package pac1;

import org.testng.annotations.Test;

public class createContactTest {
	@Test
	public void m1() {
		System.out.println("execute createContactTest");
		
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browse", "chrome");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
	public class modifyContactTest {
		@Test
		public void m1() {
			System.out.println("execute modifyContactTest");
		}
	}
	
	public class deleteContactTest {
		@Test
		public void m1() {
			System.out.println("execute deleteContactTest");
		}
}
}

