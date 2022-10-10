package tests;

import org.testng.annotations.Test;

public class DeleteProjectTest extends BaseTest {
    @Test
    public void createProject() {
        loginPage.openPage();
        loginPage.login(user, password);
        projectPage.isOpened();
        createNewProjectPage.createProject("Qase", "IO", "The great Project");
        deleteProjectPage.openPage();
        deleteProjectPage.deleteProject();
    }
}
