package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
    public String username;
    public String password;
    public String lastName;
    public Configuration () throws IOException {
        Properties properties = new Properties();
        InputStream file = new FileInputStream("C:\\Jatecorp\\Jatesoft\\Projects\\Project Bluster\\Sub-Project Lobster\\Automation\\src\\test\\resources\\app.properties");
        properties.load(file);
        username = properties.getProperty("username");
        password = properties.getProperty("password");
        lastName = properties.getProperty("lastName");
    }
}
