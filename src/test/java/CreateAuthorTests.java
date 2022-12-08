import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class CreateAuthorTests {
    public String sexyPrint(ResponseBody rb){
        return rb.prettyPrint();
    }
    @Test
    public void createBookPositiveTest() {
        //BDT => Behavioural Driven Testing
        Response response = given()
                .baseUri("http://35.205.170.236/api/v1/books/CostelCaragea")
                .auth().basic("costel.caragea@hotmail.com", "Valoare20")
                .contentType("application/json")
                .body("{\r\n  \"name\": \"Conceptul de Jmecherie in Epoca post-iluminista mijlocie\",\r\n  \"total\": \"500\",\r\n  \"available\": \"2\",\r\n  \"authors\": \"69\",\r\n  \"id\": 68\r\n}")
                .when()
                .post();

        response.then().statusCode(201);
        response.then().assertThat().body("name", is("Conceptul de Jmecherie in Epoca post-iluminista mijlocie"));
        response.then().assertThat().body("available", is("2"));
    }

}
