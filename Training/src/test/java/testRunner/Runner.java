package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","json:target/cucumber.json"})
		public class Runner{
	
}







/*@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue= {"stepdefination"},
plugin= {"pretty","html:target/Destination"},tags= {"@sanity"})
		public class Runner {
	

}*/
