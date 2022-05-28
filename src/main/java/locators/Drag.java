package locators;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Drag {

	public IOSDriver<IOSElement> driver;
	
    By dragBtn  = MobileBy.AccessibilityId("Drag"); 
	
	By renew    = MobileBy.AccessibilityId("renew");
    
	public Drag(IOSDriver<IOSElement> driver)
    {
    	this.driver = driver;
    } 

    public Drag DragBtn()
    {

    	FluentWait<IOSDriver<IOSElement>> wait = new FluentWait<IOSDriver<IOSElement>> (driver)
                								 .withTimeout(Duration.ofSeconds(15))
                								 .pollingEvery(Duration.ofMillis(250))
                								 .ignoring(NoSuchElementException.class)
                								 .ignoring(TimeoutException.class);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(this.dragBtn)).click();
    	return new Drag(driver);
    
    }
	
    public void firstCube()
    {
    	Map<String, Object> params = new HashMap<>();
    	params.put("duration", 2.0);
    	params.put("fromX", 177);
    	params.put("fromY", 734);
    	params.put("toX", 82);
    	params.put("toY", 194);
    	driver.executeScript("mobile: dragFromToForDuration", params);
    }
    
    public void secondCube()
    {
    	Map<String, Object> params = new HashMap<>();
    	params.put("duration", 2.0);
    	params.put("fromX", 209);
    	params.put("fromY", 670);
    	params.put("toX", 165);
    	params.put("toY", 195);
    	driver.executeScript("mobile: dragFromToForDuration", params);
    }

    public void thirdCube()
    {
    	Map<String, Object> params = new HashMap<>();
    	params.put("duration", 2.0);
    	params.put("fromX", 145);
    	params.put("fromY", 670);
    	params.put("toX", 248 );
    	params.put("toY", 195);
    	driver.executeScript("mobile: dragFromToForDuration", params);
    }
     
    public void fourthCube()
    {
    	Map<String, Object> params = new HashMap<>();
    	params.put("duration", 2.0);
    	params.put("fromX", 17);
    	params.put("fromY", 670);
    	params.put("toX", 83);
    	params.put("toY", 277);
    	driver.executeScript("mobile: dragFromToForDuration", params);
    }
    
    public void fifthCube()
    {
    	Map<String, Object> params = new HashMap<>();
    	params.put("duration", 2.0);
    	params.put("fromX", 113);
    	params.put("fromY", 734);
    	params.put("toX", 165);
    	params.put("toY", 277);
    	driver.executeScript("mobile: dragFromToForDuration", params);
    }
    
    public void sixthCube()
    {
    	Map<String, Object> params = new HashMap<>();
    	params.put("duration", 2.0);
    	params.put("fromX", 337);
    	params.put("fromY", 670);
    	params.put("toX", 248);
    	params.put("toY", 277);
    	driver.executeScript("mobile: dragFromToForDuration", params);
    }
    
    public void seventhCube()
    {
    	Map<String, Object> params = new HashMap<>();
    	params.put("duration", 2.0);
    	params.put("fromX", 241);
    	params.put("fromY", 734);
    	params.put("toX", 83);
    	params.put("toY", 360);
    	driver.executeScript("mobile: dragFromToForDuration", params);
    }

    public void eightCube()
    {
    	Map<String, Object> params = new HashMap<>();
    	params.put("duration", 2.0);
    	params.put("fromX", 273);
    	params.put("fromY", 670);
    	params.put("toX", 165);
    	params.put("toY", 360);
    	driver.executeScript("mobile: dragFromToForDuration", params);
    }

    public void ninthCube()
    {
    	Map<String, Object> params = new HashMap<>();
    	params.put("duration", 2.0);
    	params.put("fromX", 81);
    	params.put("fromY", 670);
    	params.put("toX", 248);
    	params.put("toY", 360);
    	driver.executeScript("mobile: dragFromToForDuration", params);
    }
    
    public Drag RenewBtn()
    {

    	FluentWait<IOSDriver<IOSElement>> wait = new FluentWait<IOSDriver<IOSElement>> (driver)
                								 .withTimeout(Duration.ofSeconds(15))
                								 .pollingEvery(Duration.ofMillis(250))
                								 .ignoring(NoSuchElementException.class)
                								 .ignoring(TimeoutException.class);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(this.renew)).click();
    	return new Drag(driver);
    
    }
    
}
