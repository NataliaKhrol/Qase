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
        loginPage.login("tashapas3579@gmail.com", "OCmaryland");
        projectPage.isOpened();
        createNewProjectPage.createProject();
        editProjectPage.editProject();
        deleteProjectPage.openPage();
        deleteProjectPage.deleteProject();
    }
}
