package case1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class register {
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
}

@When("user click the SingUp link")
public void user_click_the_SingUp_link() {
  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
}

@And("user enter username as {string} in User Name field")
public void user_enter_username_as_in_User_Name_field(String UserName) {
  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(UserName);
  
}

@And("user enter firstname as {string} in First Name field")
public void user_enter_firstname_as_in_First_Name_field(String FirstNmae) {
	driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(FirstNmae);
	
}
    

@And("user enter lastname  as {string} in Last Name field")
public void user_enter_lastname_as_in_Laat_Name_field(String LastName) {
	driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(LastName);
}

@And("user enter  password  as {string} in Password field")
public void user_enter_password_as_in_Password_field(String Password) {
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
}

@And("user re enter password  as {string} in Confirm Password field")
public void user_re_enter_password_as_in_Confirm_Password_field(String ConfirmPassword) {
	driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(ConfirmPassword);
}

@And("user click  in Genter field")
public void user_enter_clicks_on_in_Genter_field() {
	driver.findElement(By.xpath("//input[@value='Male']")).click();
    
}
@And("user enter email as {string} in E-Mail field")
public void user_enter_email_as_in_E_Mail_field(String Email) {
	driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(Email);
}

@And("user enter phone number as {string} in Mobile Number field")
public void user_enter_phone_number_as_in_Mobile_Number_field(String phno) {
	driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(phno);
}

@And("user enters  date as {string} in DOB field")
public void user_enters_date_as_in_DOB_field(String DOB) {
	driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(DOB);
}

@And("user enter address as {string} in Address field")
public void user_enter_address_as_in_Address_field(String Address) {
	driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(Address);
   }

@And("user select security question  Security Question field")
public void user_select_security_question_Security_Question_field() {
	Select a=new Select(driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")));
	a.selectByIndex(0);
}

@And("user enter Answer as {string} in Answer field")
public void user_enter_Answer_as_in_Answer_field(String Ans) {
	driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(Ans);
}

@Then("user click the Register Button")
public void user_click_the_Register_Button() {
	driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();

  
}


}
