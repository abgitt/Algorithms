package DrvierManagerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;

public class DriverFactory 
{
	public static Supplier<DriverManager> chromeInst = () -> new ChromeDriverManager();
	public static Map<String,Supplier<DriverManager>> dict = new HashMap<>();
	static
	{
		dict.put("Chrome", chromeInst);
	}
	
	public static DriverManager getDriver(String browser)
	{
		
		return dict.get(browser).get();
	}
}
