import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
    @Test(priority =1)
    public void firstTest(){
        System.out.println("Ceva");
    }
    @Test
    public void asecondTest(){
        System.out.println("Valeur");
    }

    @Test(groups = "A")
    public void thirdTest(){
        throw new NullPointerException();
    }

    @Test(dependsOnGroups = "A")
    public void fourthTest(){
        System.out.println("X");
    }

    @Test(dependsOnMethods = "thirdTest")
    public void fifthTest(){
        System.out.println("V");
    }

    @BeforeTest
    public void setUp(){
        System.out.println("HAL");
    }

    @BeforeMethod
    public void prem(){
        System.out.println("DID");
    }
}
