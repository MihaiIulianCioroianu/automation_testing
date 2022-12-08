package Utils;

import java.util.Random;

public class Helper {
    public int generatedID = generateRandomID();
    public int generateRandomID(){
        return new Random().nextInt(99999);
    }
}
