package adapters;

import com.google.gson.Gson;
import dto.ApiResponse;
import dto.Project;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ProjectAPI {
RequestSpecification requestSpecification;
    public ProjectAPI(){
        requestSpecification=
                given().
                        header("Token", "604545c23eb5a8dfd25c827422fc29c2c203461a").
                        header("Content-Type", "application/json");
    }
    public void create(String body) {
create(body, 200);

    }
    public ValidatableResponse create(String body, int statusCode){

       return requestSpecification.
                body(body).
               when().
                post("https://api.qase.io/v1/project").
               then().
                log().all().
                statusCode(statusCode);

    }
    public ApiResponse getProjectByCode(String code){
        Gson gson = new Gson();
      return

        requestSpecification.
                when().get("https://api.qase.io/v1/project/" + code).
                then().
                log().all().
                statusCode(200).
                extract().as(ApiResponse.class);
//return gson.fromJson(project, Project.class);
    }
}
