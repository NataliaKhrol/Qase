package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProjectTest extends BaseTest {

    @Test
    public void createProject() {
       loginPage.openPage();
       loginPage.login("ruchtech.minsk@gmail.com", "ruch2022");
       projectPage.isOpened();

    }
}
