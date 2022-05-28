package baseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {

public static IOSDriver<IOSElement> capabilities() throws IOException, MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		InputStream input = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/configProperties/config.properties");
		Properties prop = new Properties();
		prop.load(input);
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, prop.getProperty("Platform_Name"));
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.getProperty("platformVersion"));
		
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, prop.getProperty("automationName"));
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("deviceName"));
		caps.setCapability(MobileCapabilityType.UDID, prop.getProperty("udid"));
		caps.setCapability(MobileCapabilityType.APP, prop.getProperty("app"));
		
		caps.setCapability(MobileCapabilityType.NO_RESET, true);
		
		caps.setCapability("appium:allowTestPackages", "true");
	    caps.setCapability("appium:resetKeyboard", "true");
	    caps.setCapability("appium:simulatorStartupTimeout", 180000); 
	    
		IOSDriver<IOSElement> driver = new IOSDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		return driver;
	}
	
}
