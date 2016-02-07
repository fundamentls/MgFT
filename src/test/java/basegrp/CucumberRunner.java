package basegrp;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Ruben-Portatil on 07/02/2016.
 */

@RunWith(Cucumber.class)
@Cucumber.Options(
        features = {"src/test/features"}
)
public class CucumberRunner {
}
