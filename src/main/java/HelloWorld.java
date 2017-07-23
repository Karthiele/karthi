import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWorld
{

	@Test
	public void test()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Testleaf\\TestLeaf_Softwares\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.co.in");
		System.out.println("TEst");
	}
	
}
