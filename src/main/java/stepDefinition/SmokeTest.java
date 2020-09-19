//package stepDefinition;
//
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
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class SmokeTest{
//
//	WebDriver driver;
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
//		
//	    
//	}
//	 //(.*)
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String un, String up) {
//		driver.findElement(By.name("username")).sendKeys(un);
//	    driver.findElement(By.name("password")).sendKeys(up);
//	}
//
//	@Then("^user can click on loginbutton$")
//	public void user_can_click_on_login_button() {
//		 WebElement loginBtn= driver.findElement(By.xpath("//*[@value='Login']"));
//		   JavascriptExecutor js = (JavascriptExecutor)driver;
//		   js.executeScript("arguments[0].click()", loginBtn);
//	}
//
//	@Then("^user is on the homePage$")
//	public void user_is_on_the_homePage() {
//		String title = driver.getTitle();
//		   System.out.println("HomePage title::"+title);
//		   Assert.assertEquals("CRMPRO", title);
//	}
//	
//	@Then("^user moves to new Contacts$")
//	public void user_moves_to_new_Contacts()
//	{
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//	}
//	
//	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void user_enters_contact_details(String firstname, String lastname, String position)
//	{
//		driver.findElement(By.id("first_name")).sendKeys(firstname);
//		driver.findElement(By.id("surname")).sendKeys(lastname);
//		driver.findElement(By.id("company_position")).sendKeys(position);	
//		driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/input[2]")).click();
//	}
//	
//	@Then("^Close the browser$")
//	public void close_the_browser()
//	{
//		driver.quit();
//	}
//	
//}
