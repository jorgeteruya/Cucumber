import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE
		
		//Skipped, valida o cenário de teste, não executando as funções em si
		//dryRun = true,
		//strict = true
		)

public class Runner_Test {

}
