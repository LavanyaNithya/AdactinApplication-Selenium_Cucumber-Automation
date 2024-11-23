package com.runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.baseclass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/com/featurefile/Adactin.feature"},
        glue = {"com.stepdefinition","com.hooks"},
        dryRun = false,
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        //tags = {"@check1,@search,@check2,@continue,@check3,@booking,@check4,@check5"},          //to execute the scenario with particular tag
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"}      //Extent report
        //plugin = {"html:HtmlReport/sample.html","pretty"}    
		
		)

public class AdactinTest extends BaseClass {
	
	@BeforeClass
	public static void setUp()
	{
	 driver = browserlaunch("chrome");
		
	}
	
	@AfterClass
	public static void tearDown()
	{
		driver.quit();
	}
}
