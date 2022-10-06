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
        loginPage.login(user, password);
        projectPage.isOpened();
        createNewProjectPage.createProject("QASE", "QS", "The third Project in Qase");
        editProjectPage.editProject("WebApplication", "Blabla");
        deleteProjectPage.openPage();
        deleteProjectPage.deleteProject();
    }
}
