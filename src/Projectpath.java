import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Projectpath 
{

	public static void main(String[] args) 
	{
	//String projectpath=	System.getProperty("user.dir");
		//System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver", "")
		WebDriver driver=new ChromeDriver();
		driver.get("https://rbgtechnologies.com");
		
	}

}
