package utilities;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	public static void settingsPopulate() throws IOException 
	{
		ConfigReader reader = new ConfigReader();
		reader.readProperty();
	}
	
	private void readProperty() throws IOException 
	{
		Properties prop = new Properties();
		prop.load(getClass().getResourceAsStream("Config.properties"));
		Settings.browser = BrowserType.valueOf(prop.getProperty("browser"));
		Settings.url = prop.getProperty("url");
	}
}	
	

