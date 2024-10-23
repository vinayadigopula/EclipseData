import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Propertyfileeader 
{
	static WebDriver driver;
	public static void main(String[] args) throws Throwable
	{
		FileInputStream file=new FileInputStream("C:\\Users\\vinay\\workspace\\Be for yourdelf\\propertyfile\\config.properties");
		Properties properties=new Properties();
		properties.load(file);
		String value=properties.getProperty("browser");
		System.out.println(value);
		if (value.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(value.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		else if(value.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
	}

}
