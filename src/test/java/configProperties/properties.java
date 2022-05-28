package configProperties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class properties {

	public static void main(String[] args) throws IOException{
		
		try (OutputStream output = new FileOutputStream("./src/test/java/configProperties/config.properties"))
		{
			Properties prop = new Properties();
			
			prop.setProperty(MobileCapabilityType.PLATFORM_NAME, "iOS");
			prop.setProperty(MobileCapabilityType.PLATFORM_VERSION, "14.4");
			
			prop.setProperty(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
			prop.setProperty(MobileCapabilityType.DEVICE_NAME, "iphone11");
			prop.setProperty(MobileCapabilityType.UDID, "FA04A473-A706-4ABC-B103-7A9EE8AEDBD7");
			prop.setProperty(MobileCapabilityType.APP, System.getProperty("user.dir")+"/App/WebDriverIO.app");
			prop.setProperty(MobileCapabilityType.NO_RESET, "true");
			prop.setProperty(MobileCapabilityType.FULL_RESET, "false");
			
			prop.setProperty(IOSMobileCapabilityType.CONNECT_HARDWARE_KEYBOARD, "false");
			prop.setProperty(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, "true");
			prop.setProperty(IOSMobileCapabilityType.BUNDLE_ID, "org.wdioNativeDemoApp");
			prop.setProperty(IOSMobileCapabilityType.APP_NAME, "wdioDemoApp");
			
			prop.store(output, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}

}
