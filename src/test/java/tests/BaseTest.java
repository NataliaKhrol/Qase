package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.*;
import pages.*;
import utils.PropertyReader;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    LoginPage loginPage;
    ProjectPage projectPage;
    CreateNewProjectPage createNewProjectPage;
    DeleteProjectPage deleteProjectPage;
    EditProjectPage editProjectPage;
    String user;
    String password;

    @BeforeMethod
    public void setup() {
        Configuration.baseUrl = System.getProperty("QASE_URL", PropertyReader.getProperty("qase.url"));

        user = PropertyReader.getProperty("qase.user");
        password = PropertyReader.getProperty("qase.password");
        Configuration.browser = "chrome";
        // Configuration.headless = true;
        Configuration.timeout = 100000;
        // Configuration.clickViaJs = true;
        // Configuration.fastSetValue = true;

        loginPage = new LoginPage();
        projectPage = new ProjectPage();
        createNewProjectPage = new CreateNewProjectPage();
        deleteProjectPage = new DeleteProjectPage();
        editProjectPage = new EditProjectPage();


        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));

        open();
        getWebDriver().manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        if (getWebDriver() != null)
            getWebDriver().quit();
    }
}
