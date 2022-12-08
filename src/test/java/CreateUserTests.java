import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.function.Consumer;
import java.util.function.Function;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class CreateUserTests {
    public String sexyPrint(ResponseBody rb){
        return rb.prettyPrint();
    }
    @Test
    public void createUserPositiveTest(){
        //BDT => Behavioural Driven Testing
        given()
                .baseUri("http://35.205.170.236/api/v1/users/signup")
                .contentType("application/json")
                .body("{\n" +
                        "  \"username\": \"22\",\n" +
                        "  \"name\": \"22\",\n" +
                        "  \"email\": \"22@hotmail.com\",\n" +
                        "  \"password\": \"Valoare20\",\n" +
                        "  \"password_confirmation\": \"Valoare20\"\n" +
                        "}")
                .when()
                //.getBody();
                //.sexyPrint();
                .post()
                .getBody();
                //.then().statusCode(200);
    }

    @Test
    public  void getResponseAsResponse(){
        Response response = given()
                .baseUri("http://35.205.170.236/api/v1/users/view")
                .auth().basic("costel.caragea@hotmail.com", "Valoare20")
                .when()
                .get();

        String resourceBody = sexyPrint(response);
        Assert.assertEquals(resourceBody.contains("7816"), true);
    }

    @Test
    public void assertResponseUsingRestssured(){
        given()
                .baseUri("http://35.205.170.236/api/v1/users/view")
                .auth().basic("costel.caragea@hotmail.com", "Valoare20")
                .when()
                .get()
                .then().assertThat().body("id", is("2983"));
    }
}
