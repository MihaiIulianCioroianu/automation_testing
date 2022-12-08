package PageObject;

import Utils.Configuration;
import Utils.Helper;
import org.json.JSONObject;

import java.io.IOException;

public class AuthorPageObject {
    public Helper helper = new Helper();
    public Configuration configuration = new Configuration();
    public final String CREATEAUTHORURL = "http://35.205.170.236/api/v1/authors/"+"CostelCaragea";
    public final String JSONCT = "application/json";
    public JSONObject jSONObject = new JSONObject()
            .put("firstName", "MarianCostel"+helper.generatedID)
            .put("lastName", configuration.lastName)
            .put("id", "537");

    public AuthorPageObject() throws IOException {
    }
}
