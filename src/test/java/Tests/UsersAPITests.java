package Tests;

import StepObject.UsersStepObject;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class UsersAPITests {
    UsersStepObject userSO = new UsersStepObject();

    public UsersAPITests() throws IOException {
    }

    @Test
    public void positiveCreateUserTest(){
        userSO.createUser();
        Assert.assertEquals(userSO.response
                .getBody().prettyPrint().contains("MarianCostel" + userSO.userPO.helper.generatedID), true);
        Assert.assertEquals(200, (userSO.response.statusCode()));

    }
}
