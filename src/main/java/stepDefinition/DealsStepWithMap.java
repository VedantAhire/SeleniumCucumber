package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealsStepWithMap {
WebDriver driver;
	
	
	@Given("^user is already on loginPage$")
	public void user_is_already_on_login_page() {
		 System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		    driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.crmpro.com/");
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^title of loginPage is FreeCRM$")
	public void title_of_login_page_is_free_crm() {
		String title= driver.getTitle();
		System.out.println("LoginPage title::"+title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support." );
	}
	
		
		@Then("^user enters username and password$")
		public void user_enters_username_and_password(DataTable credentials) {
			  List<Map<String, String>> list = credentials.asMaps(String.class, String.class);
			  for(Map<String,String> data:list)
			{
			driver.findElement(By.name("username")).sendKeys(data.get("username"));
		    driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
			}
	
		@Then("^user can click on loginPage$")
		public void user_can_click_on_login_page() {
			 WebElement loginBtn= driver.findElement(By.xpath("//*[@value='Login']"));
			   JavascriptExecutor js = (JavascriptExecutor)driver;
			   js.executeScript("arguments[0].click()", loginBtn);
		}
		
		@Then("^user is on the homePage$")
		public void user_is_on_the_homePage() {
			String title = driver.getTitle();
			   System.out.println("HomePage title::"+title);
			   Assert.assertEquals("CRMPRO", title);
		}
	
		@Then("^user moves to new Deals$")
		public void user_moves_to_new_Deal()
		{
			driver.switchTo().frame("mainpanel");
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		}
		
		@Then("^user enters deal details$")
		public void user_enters_deal_details(DataTable credentials)
		{
			List<Map<String, String >> list = credentials.asMaps(String.class, String.class);
					for(Map<String, String> data1: list ) {
			driver.findElement(By.id("title")).sendKeys(data1.get("title"));
			driver.findElement(By.id("amount")).sendKeys(data1.get("amount"));
			driver.findElement(By.id("probability")).sendKeys(data1.get("probability"));
			driver.findElement(By.id("commission")).sendKeys(data1.get("commission"));
			driver.findElement(By.xpath("//*[@type='submit' and @value='Save']")).click();
			
	
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[@title='Deals']"))).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
			
		}
					
					
		}
	
		@Then("^Close the browser$")
		public void close_the_browser()
		{
			driver.quit();
		}

	
	

}
