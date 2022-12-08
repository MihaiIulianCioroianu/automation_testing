package Tests;

import StepObject.AuthorStepObject;
import StepObject.UsersStepObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AuthorAPITests {
    AuthorStepObject authorSO = new AuthorStepObject();

    public AuthorAPITests() throws IOException {
    }


    @Test
    public void positiveCreateAuthorTest() {
        authorSO.createAuthor();
        authorSO.response
                .getBody().prettyPrint();
        Assert.assertEquals(authorSO.response
                .getBody().prettyPrint().contains("firstName"), true);
        Assert.assertEquals(200, (authorSO.response.statusCode()));

    }
}
