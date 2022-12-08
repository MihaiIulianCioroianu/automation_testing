import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class CreateBookTests {
    public String sexyPrint(ResponseBody rb){
        return rb.prettyPrint();
    }
    @Test
    public void createAuthorPositiveTest() {
        //BDT => Behavioural Driven Testing
        Response response = given()
                .baseUri("http://35.205.170.236/api/v1/authors/CostelCaragea")
                .auth().basic("costel.caragea@hotmail.com", "Valoare20")
                .contentType("application/json")
                .body("{\r\n  \"firstName\": \"Autor3934\",\r\n  \"lastName\": \"Autor3934\",\r\n  \"id\": 23789\r\n}")
                .when()
                .post();

        response.then().statusCode(200);
        response.then().assertThat().body("firstName", is("Autor3934"));
    }
}
