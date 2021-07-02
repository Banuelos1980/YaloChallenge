package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartWebDriver 
{
	public static WebDriver driver;

	public static void openBrowser(BrowserType type, String url)
	{
		switch(type)
		{
		case CHROME:
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usuario\\eclipse-workspace\\POMProject\\src\\executables\\chromedriver 91.0.44.exe");
		driver= new ChromeDriver();
		break;
		case FIREFOX:
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\usuario\\eclipse-workspace\\POMProject\\src\\executables\\geckodriver- v0.29.1.exe");
		driver= new FirefoxDriver();
		break;
		case IE:
		System.setProperty("webdriver.gecko.driver", "");
		break;
		case SAFARI:
		System.setProperty("webdriver.gecko.driver", "");
		break;
		default:
		throw new IllegalArgumentException();
		}
		driver.manage().window().maximize();
		driver.get(url);
	}
}
