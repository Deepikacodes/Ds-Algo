package stepDefinitions;


import org.testng.Assert;

import driverManager.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.Register;
import utilities.LoggerLoad;

public class Register_SD {
public Register register =new Register(DriverFactory.getDriver());

// Register_tc1
@And("Clicks on Register link")
public void clicks_on_register_link() {
    register.clickRegisterLink();
    LoggerLoad.info("User clicks on Register link");;
}
@Then("User should be successfully navigated to Register page")
public void user_should_be_successfully_navigated_to_register_page() {
	LoggerLoad.info("Successfully navigated to the Registration page");
	String regTitle=register.getRegisterTitle();
    Assert.assertEquals(regTitle, "Registration");
}

//Register_tc2
@Given("User launches Register page")
public void user_launches_register_page() {
    register.navigateToRegister();
    LoggerLoad.info("Launching Register page with url");
}

@When("User clicks on Login link")
public void user_clicks_on_login_link() throws Exception {
    register.clickLoginLink();
    LoggerLoad.info("Clicking on the Login link");
}

@Then("User should be successfully navigated to Login page")
public void user_should_be_successfully_navigated_to_login_page() {
    String loginTxt=register.loginTitle();
    LoggerLoad.info("Successful navigation to Login page and the Login page title is "+loginTxt);
    Assert.assertEquals(loginTxt,"Login");
    }

// Register_tc3

@When("User enters following  valid credentials")
public void user_enters_following_valid_credentials(DataTable dataTable) throws InterruptedException {
    register.enterValidUsername(dataTable);
    register.enterValidPassword(dataTable);
    register.enterValidPasswordCfm(dataTable);
    LoggerLoad.info("Registration with valid credentials from data table");
}

@And("Clicks on the Register button")
public void clicks_on_the_register_button() {
    register.clickRegisterBtn();
    LoggerLoad.info("Click on Register button");
}

@Then("User should be  able to  successfully register and see the success message {string}")
public void user_should_be_able_to_successfully_register_and_see_the_success_message(String successMsg) throws Exception {
    Assert.assertEquals(register.getNewAccountCreatedText().contains(successMsg), true);
    LoggerLoad.info("Successful Registration  with valid credentials will display "+successMsg+"message in the logged in homepage");
}

//Register_tc4

@When("User clicks on Register button without entering Username and password")
public void user_clicks_on_register_button_without_entering_username_and_password() {
   register.clickRegisterBtn();
   LoggerLoad.info("Registration with empty username and password fields ");
}

@Then("User should see a pop-up text {string} below Username field")
public void user_should_see_a_pop_up_text_please_fill_out_this_field_below_username_field(String popUpMsg) throws Exception {
   Assert.assertTrue(register.getEmptyUser(), "Required attribute is not found ");
   Assert.assertEquals(register.getEmptyUserPopUp(), popUpMsg);
   LoggerLoad.info("The pop up message for empty fields under Username :"+register.getEmptyUserPopUp());
}

//Register_tc5

@When("User clicks on Register button entering  valid {string} and empty  Password field")
public void user_clicks_on_register_button_entering_valid_and_empty_password_field(String Username) {
   register.enterUserName(Username);
   register.clickRegisterBtn();
   LoggerLoad.info("Registration with valid username empty password field");
}

@Then("User should see a pop-up text {string} under Password field")
public void user_should_see_a_pop_up_text_under_password_field(String popUpMsg) throws Exception {
   Assert.assertTrue(register.getEmptyPassword());
   Assert.assertEquals(register.getEmptyPwdPopUp(), popUpMsg);
   LoggerLoad.info("The pop up message for empty field under Password:"+register.getEmptyPwdPopUp());
   
}
//Register_tc6

@When("User clicks  on Register button entering valid {string} ,{string} and empty  Password confirmation field")
public void user_clicks_on_register_button_entering_valid_and_empty_password_confirmation_field(String Username, String Password) {
    register.enterUsrPass(Username, Password);
    register.clickRegisterBtn();
    LoggerLoad.info("Registration with empty Password confirmation field");
}

@Then("User should  see a pop-up text under password confirmation field {string}")
public void user_should_see_a_pop_up_text_under_password_confirmation_field(String popUpMsg) throws Exception {
	Assert.assertTrue(register.getEmptyPasswordCfm());
 Assert.assertEquals(register.getEmptyPwdCfmPopUp(), popUpMsg);
 LoggerLoad.info("The pop up message for empty field under password confirmation :"+register.getEmptyPwdCfmPopUp());
}

//Register_tc7
@When("User clicks  on Register button entering valid {string} ,{string} and empty Username field")
public void user_clicks_on_register_button_entering_valid_and_empty_username_field(String pwd, String pwdCfm) {
   register.enterPassPassCfm(pwd, pwdCfm);
   register.clickRegisterBtn();
   LoggerLoad.info("Registration with empty Username field ");
}




//Register_tc8

@When("User clicks  on Register button entering input fields {string},{string},{string}")
public void user_clicks_on_register_button_entering_input_fields(String Username, String Password, String pwdCfm) {
    register.enterPassmismatch(Username, Password, pwdCfm);
    register.clickRegisterBtn();
    LoggerLoad.info("Registration for password mismatch");
}

@Then("User should  see the error message {string}")
public void user_should_see_the_error_message(String actualErrorMsg) throws Exception  {
   Assert.assertEquals(register.getPwdMismatchMsg(), actualErrorMsg);
   LoggerLoad.info("Error message for password mismatch"+register.getPwdMismatchMsg());
}

}
