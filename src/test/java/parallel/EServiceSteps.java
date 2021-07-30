package parallel;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.pages.eServicePortal;
import com.qa.factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class EServiceSteps {
    private eServicePortal eServicePortal = new eServicePortal(DriverFactory.getDriver());

    @Given("user has already logged in to eService application")
    public void userHasAlreadyLoggedInToEServiceApplication(DataTable credTable) {
        System.out.println("Code worked upto here....");
        DriverFactory.getDriver()
                .get("http://eservices.scd.gov.ae/");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Map<String, String>> credList = credTable.asMaps();
        String userName = credList.get(0).get("username");
        String password = credList.get(0).get("password");
        System.out.println("printing :"+userName +":"+password);
        eServicePortal.doLogin(userName, password);
    }
}
