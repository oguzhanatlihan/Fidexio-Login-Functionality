package com.fidexio.step_definitions;
import com.fidexio.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {


    @After
    public void teardownScenario(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
scenario.attach(screenshot,"img/png",scenario.getName());


        }
        Driver.closeDriver();
    }
}