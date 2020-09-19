//package stepDefinition;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class DealStepDefinition {
//WebDriver driver;
//	
//	
//	@Given("^user is already on loginPage$")
//	public void user_is_already_on_login_page() {
//		 System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
//		    driver= new ChromeDriver();
//		    driver.manage().window().maximize();
//		    driver.get("https://www.crmpro.com/");
//		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
//
//	@When("^title of loginPage is FreeCRM$")
//	public void title_of_login_page_is_free_crm() {
//		String title= driver.getTitle();
//		System.out.println("LoginPage title::"+title);
//		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support." );
//	}
//	
//		@Then("^user enters username and password$")
//		public void user_enters_username_and_password(DataTable datae) {
//			List<List<String>> data= datae.cells();
//			driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//		    driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//		}
//	
//		@Then("^user can click on loginPage$")
//		public void user_can_click_on_login_page() {
//			 WebElement loginBtn= driver.findElement(By.xpath("//*[@value='Login']"));
//			   JavascriptExecutor js = (JavascriptExecutor)driver;
//			   js.executeScript("arguments[0].click()", loginBtn);
//		}
//		
//		@Then("^user is on the homePage$")
//		public void user_is_on_the_homePage() {
//			String title = driver.getTitle();
//			   System.out.println("HomePage title::"+title);
//			   Assert.assertEquals("CRMPRO", title);
//		}
//	
//		@Then("^user moves to new Deals$")
//		public void user_moves_to_new_Deal()
//		{
//			driver.switchTo().frame("mainpanel");
//			Actions action = new Actions(driver);
//			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//		}
//		
//		@Then("^user enters deal details$")
//		public void user_enters_deal_details(DataTable Data1)
//		{
//			List<List<String>> dealValue = Data1.cells();
//			driver.findElement(By.id("title")).sendKeys(dealValue.get(0).get(0));
//			driver.findElement(By.id("amount")).sendKeys(dealValue.get(0).get(1));
//			driver.findElement(By.id("probability")).sendKeys(dealValue.get(0).get(2));
//			driver.findElement(By.id("commission")).sendKeys(dealValue.get(0).get(3));
//			driver.findElement(By.xpath("//*[@type='submit' and @value='Save']")).click();
//		}
//	
//		@Then("^Close the browser$")
//		public void close_the_browser()
//		{
//			driver.quit();
//		}
//
//}
