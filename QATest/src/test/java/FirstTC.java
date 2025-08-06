import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class FirstTC {
    WebDriver driver;
    @BeforeSuite
    public void setUp(){

    }
    @Test
    public void openChrome(){}

    @AfterMethod
    public void tearDown(){
    }
}
