package PageObject;

import Utils.Configuration;
import Utils.Helper;
import org.json.JSONObject;

import java.io.IOException;

public class BookPageObject {
    public Helper helper = new Helper();
    public Configuration configuration = new Configuration();
    public final String CREATEBOOKURL = "http://35.205.170.236/api/v1/books/"+"CostelCaragea";
    public final String EDITBOOKURL = "http://35.205.170.236/api/v1/books/CostelCaragea/537";
    public final String JSONCT = "application/json";
    public JSONObject jSONObject = new JSONObject()
            .put("name", "O istorie completa a valorii si jmecheriei")
            .put("total", "13")
            .put("available", "93268")
            .put("authors", "22")
            .put("id", "537");
    public JSONObject jSONObject2 = new JSONObject()
            .put("name", "O istorie completa a valorii si jmecheriei")
            .put("total", "12")
            .put("available", "93268")
            .put("authors", "22")
            .put("id", "537");

    public BookPageObject() throws IOException {
    }
}
