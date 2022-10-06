package tests.api;

import adapters.ProjectAPI;
import com.google.gson.Gson;
import dto.ApiResponse;
import dto.Project;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ProjectApiTest {
    ProjectAPI projectAPI;

    //TODO generate unique code faker

    @Test
    public void createProject() {
        projectAPI = new ProjectAPI();
        projectAPI.create("{\\n\" +\n" +
                "                 \"     \\\"title\\\": \\\"APIProject\\\",\\n\" +\n" +
                "                 \"     \\\"code\\\": \\\"API3\\\",\\n\" +\n" +
                "                 \"     \\\"description\\\": \\\"bnlabla\\\",\\n\" +\n" +
                "                 \"     \\\"access\\\": \\\"all\\\",\\n\" +\n" +
                "                 \"     \\\"group\\\": \\\"iubyvadsiubasdbijads\\\"\\n\" +\n" +
                "                 \"}");

    }

    public void createProjectOnlyRequiredFields() {
        //TODO generate unique code faker
        projectAPI = new ProjectAPI();
        projectAPI.create("{\n" +
                "     \"title\": \"APIProject\",\n" +
                "     \"code\": \"API3\"\n" +
                "}");
    }


    public void createProject400NoTitle() {
        //TODO generate unique code faker
        projectAPI = new ProjectAPI();
        Gson gson = new Gson();
        Project project = Project.builder().
                title("APIProject").
                code("API2").
                build();
        projectAPI.create(gson.toJson(project));

    }

    @Test
    public void getProject() {
        projectAPI = new ProjectAPI();
        ApiResponse response = projectAPI.getProjectByCode("API1");
    }
}
