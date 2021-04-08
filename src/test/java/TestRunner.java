import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:format"},
        features = "Feature/Problem1.feature",
        glue = {"/D:/Rahat/MassmutualAuto/src/test/java/stepdefs"}
)
public class TestRunner {
}
