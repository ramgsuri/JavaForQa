
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyFirstTest {

    @Test
    public void checkThatJavaMavenAndJUnitAreInstalled(){

        Assertions.assertTrue(true, "this test should pass if Java, JUnit and Maven are installed");
    }
}
