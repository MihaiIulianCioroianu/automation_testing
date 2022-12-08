package PageObject;

import Utils.Configuration;
import Utils.Helper;
import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.IOException;

public class UserPageObject {
    public Helper helper = new Helper();
    public Configuration configuration = new Configuration();
    public final String CREATEUSERURL = "http://35.205.170.236/api/v1/users/signup";
    public final String JSONCT = "application/json";
    public JSONObject jSONObject = new JSONObject()
            .put("username", "MarianCostel"+helper.generatedID)
            .put("name", "MarianCostel"+helper.generatedID)
            .put("email", "marian.costel"+helper.generatedID+"@hotmail.com")
            .put("password", "abc123")
            .put("password_confirmation", "abc123");
    public JSONObject jSONObject2 = new JSONObject()
            .put("username", configuration.username)
            .put("name", "MarianCostel"+helper.generatedID)
            .put("email", "marian.costel"+helper.generatedID+"@hotmail.com")
            .put("password", configuration.password)
            .put("password_confirmation", configuration.password);

    public UserPageObject() throws IOException {

    }
}
