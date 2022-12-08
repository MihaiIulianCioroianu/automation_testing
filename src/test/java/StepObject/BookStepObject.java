package StepObject;

import PageObject.AuthorPageObject;
import PageObject.BookPageObject;
import io.restassured.response.Response;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class BookStepObject {
    public BookPageObject bookPO;

    public Response response;

    public BookStepObject() throws IOException {
        bookPO = new BookPageObject();
    }

    public void createBook(){
        response = given()
                .baseUri(bookPO.CREATEBOOKURL)
                .auth().basic("costel.caragea@hotmail.com", "Valoare20")
                .contentType(bookPO.JSONCT)
                .body(bookPO.jSONObject.toString())
                .post();
    }
    public void editBook(){
        response = given()
                .baseUri(bookPO.EDITBOOKURL)
                .auth().basic("costel.caragea@hotmail.com", "Valoare20")
                .contentType(bookPO.JSONCT)
                .body(bookPO.jSONObject2.toString())
                .put();
    }
}
