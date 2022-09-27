package seliniumautosignin.package01;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Class01 {
	@Test
	public   void  t_01_validate_signin () 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91630\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://vprismqc.vidgyor.com/");
		 
		  JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		WebElement name = (WebElement)jse.executeScript(" return document.querySelector('amplify-authenticator > amplify-sign-in' ).shadowRoot.querySelector('div >amplify-email-field > amplify-form-field >div >div>slot-fb>amplify-input>input')");
		
		WebElement pswd = (WebElement)jse.executeScript("return document.querySelector('amplify-authenticator > amplify-sign-in' ).shadowRoot.querySelector('div >amplify-password-field > amplify-form-field >div >div>slot-fb>amplify-input>input')");

		WebElement btm = (WebElement)jse.executeScript("return  document.querySelector('amplify-authenticator > amplify-sign-in' ).shadowRoot.querySelector('amplify-form-section>form>amplify-section>section>div>div>slot>div>slot>amplify-button>button')");
		
		String js="arguments[0].setAttribute('value','parikshithpilli@gmail.com')";
		String jspsd="arguments[0].setAttribute('value','parikshith')";
		 
		( (JavascriptExecutor)driver).executeScript(js,name);
		( (JavascriptExecutor)driver).executeScript(jspsd,pswd);
		( (JavascriptExecutor)driver).executeScript("arguments[0].click();",btm);
		
		
		
		 
		 
		 
	}

}
