package StepObject;

import PageObject.AuthorPageObject;
import PageObject.UserPageObject;
import io.restassured.response.Response;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class AuthorStepObject {
    public AuthorPageObject authorPO;

    public Response response;

    public AuthorStepObject() throws IOException {
        authorPO = new AuthorPageObject();
    }

    public void createAuthor(){
        response = given()
                .baseUri(authorPO.CREATEAUTHORURL)
                .auth().basic("costel.caragea@hotmail.com", "Valoare20")
                .contentType(authorPO.JSONCT)
                .body(authorPO.jSONObject.toString())
                .post();
    }
}
