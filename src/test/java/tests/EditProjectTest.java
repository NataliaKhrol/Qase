package tests;

import org.testng.annotations.Test;

public class EditProjectTest extends BaseTest {
    @Test
    public void createProject() {
        loginPage.openPage();
        loginPage.login(user, password);
        createNewProjectPage.createProject("Qase", "IO", "The greatest Project");
        editProjectPage.editProject("WebApplication", "Blabla");
    }
}
