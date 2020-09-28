package runners.com.stackoverflow;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features ={"src\\test\\resources\\stories"},
        glue= {"src\\test\\java\\com\\stackoverflow\\steps"},
        monochrome = true,
        tags = {},
        plugin = {"pretty", "html:target\\cucumber", "json:target\\cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target\\report.html"}
)
public class MainRunner{
// , "com.cucumber.listener.ExtentCucumberFormatter:target\\report.html"
}