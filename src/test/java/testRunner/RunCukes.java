package testRunner;


import config.Constants;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;

/**
 * Created by vinayak on 13/9/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"pretty", "html:target/default-html-reports", "json:target/cucumber.json",
               },
        glue = {"stepDefinitions"},
        monochrome = false,
        dryRun = false,
        tags = {"@generic"}
)


public class RunCukes {

    @BeforeClass
    public static void clearErrorScreenshots() {
        File dir = new File(Constants.screenshotpath);
        for (File f : dir.listFiles()) {
            if (f.getName().startsWith("check")) {
                f.delete();
            } else if (!f.delete()) {
                System.err.println("Can't remove " + f.getAbsolutePath());
            }
        }
    }

}
