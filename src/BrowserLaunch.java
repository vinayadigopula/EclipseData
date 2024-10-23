import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class   BrowserLaunch 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\workspace\\Be for yourdelf\\WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rbgtechnologies.com");
		
	}

}
