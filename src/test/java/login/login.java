package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class login {
	 WebDriver driver;
@Given("user lanch the browser")
public void user_lanch_the_browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.28\\Desktop\\san\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
}    
@And("user open TestMeApp")
public void user_open_TestMeApp() {
	driver.get("http://10.232.237.143:443/TestMeApp");
}
@And("user in the home page")
public void user_in_the_home_page() {
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
}
@And("user enter {string} in user name field")
public void user_enter_in_user_name_field(String string) {
    driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
}
@And("user enter {string} in password field")
public void user_enter_in_password_field(String string) {
   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
   
}
@Then("click the login button")
public void click_the_login_button() {
	
driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
}
}
