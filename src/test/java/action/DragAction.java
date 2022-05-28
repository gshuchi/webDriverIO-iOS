package action;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import baseTest.BaseTest;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import locators.Drag;

public class DragAction extends BaseTest {
	
	IOSDriver<IOSElement> driver;

    @BeforeMethod(alwaysRun = true)
    public void InvokeApp() throws IOException, InterruptedException
    {
    	driver = capabilities();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	System.out.println("App Installed Successfully for DragAction");
    }

    
    @Test
    public void InvokeTest() throws IOException, InterruptedException
    {
    	try
    	{
    	 Drag drag = new Drag(driver);
    	 drag.DragBtn();
    	 drag.firstCube();
    	 drag.secondCube();
    	 drag.thirdCube();
    	 drag.fourthCube();
    	 drag.fifthCube();
    	 drag.sixthCube();
    	 drag.seventhCube();
    	 drag.eightCube();
    	 drag.ninthCube();
    	 System.out.println("Dragged Successfully");
    	}catch(Exception e)
    	{
         e.printStackTrace();
     	}
    }
    
    
    
    @AfterMethod(alwaysRun = true)
    public void driverClose()
    {
    	if(null != driver)
		{
			driver.quit();
		}
    }
}
