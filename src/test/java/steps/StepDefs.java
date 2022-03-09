package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;
import pages.Page;

public class StepDefs extends Page implements En  {


    Page page=new Page();

    @Given("I go to url (.*)$")
    public void launchApp(String url)
    {
        page.getUrl(url);
    }

    @When("^I can log in with the following \"([^\"]*)\" and \"([^\"]*)\"$")
    public void signinToApp(String username,String password) throws InterruptedException {

        page.clickSignin();
        page.passUserInfo(username,password);
        page.login();

    }





}

