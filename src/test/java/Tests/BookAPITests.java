package Tests;

import StepObject.AuthorStepObject;
import StepObject.BookStepObject;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class BookAPITests {
    BookStepObject bookSO = new BookStepObject();

    public BookAPITests() throws IOException {
    }

    @Test
    public void positiveCreateBookTest() {
        bookSO.createBook();
        bookSO.response
                .getBody().prettyPrint();
        Assert.assertEquals(bookSO.response
                .getBody().prettyPrint().contains("O istorie completa"), true);
        Assert.assertEquals(201, (bookSO.response.statusCode()));

    }

    @Test
    public void positiveEditBookTest(){
        bookSO.editBook();
        bookSO.response
                .getBody().prettyPrint();
        Assert.assertNotEquals(bookSO.response.getBody().jsonPath().getString("created_at"), bookSO.response.getBody().jsonPath().getString("Updated_at"));

    }
}
