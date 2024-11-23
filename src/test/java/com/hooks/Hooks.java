package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.BaseClass;

import cucumber.api.Result.Type;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class Hooks extends BaseClass{
	
	@Before
	public void beforeScenario(Scenario s)
	{
		String name = s.getName();
		System.out.println("Scenario name:"+name);
		/*Type status = s.getStatus();
		System.out.println(status);
		s.write(s.getId());*/
	}
	
	@After
	public void afterScenario(Scenario s)
	{
		boolean failed = s.isFailed();
		System.out.println("Isfailed:"+failed);
		/*Type status = s.getStatus();
	    System.out.println(status);*/
	}
	
	/*@After(order = 2)                                    //When there are multiple hooks highest order executes first
	public void afterScenario1(Scenario s)
	{
	     System.out.println("Executes first");
	}
	
	@After(order = 1)
	public void afterScenario2(Scenario s)
	{
		System.out.println("Executes second");
	}
	
	@BeforeStep
	public void beforeSteps(Scenario s)
	{
		//s.write("started");
		Type status = s.getStatus();
		System.out.println(status);
	}
	
	@AfterStep
	public void afterSteps(Scenario s)
	{
		//s.write("finished");
		Type status = s.getStatus();
		System.out.println(status);
		
	}*/
	
	//To take screenshot after every scenario
	
	@After
	public void afterScenarioScreenshot(Scenario s)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		s.embed(screenshot, "image/png");
		
	}
}
