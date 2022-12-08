package StepObject;

import PageObject.UserPageObject;
import io.restassured.response.Response;
import org.apache.commons.io.IOUtils;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class UsersStepObject {
    public UserPageObject userPO;

    public Response response;

    public UsersStepObject() throws IOException {
        userPO = new UserPageObject();
    }

    public void createUser(){
        response = given()
                .baseUri(userPO.CREATEUSERURL)
                .contentType(userPO.JSONCT)
                .body(userPO.jSONObject.toString())
                .post();
    }
}
