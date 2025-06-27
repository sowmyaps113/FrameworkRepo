package MavenBuildLifeCyclePackage1;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createContactTest()
	{
		System.out.println("Execute createContactTest");
		
		String BROWSER=System.getProperty("browser", "Chrome");
		String URL=System.getProperty("url");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
			
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
	
	@Test
	public void modifyContactTest()
	{
		System.out.println("Execute modifyContactTest");
	}
}
