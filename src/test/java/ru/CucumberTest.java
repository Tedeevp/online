package ru;


//import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "10",
        glue = {"ru.stepdefs"},
        features = {"src/test/resources/features"})//C:\Users\Петрик\IdeaProjects\Online\src\test\resources\features
public class CucumberTest {
}
