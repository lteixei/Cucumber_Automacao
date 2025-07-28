package tests;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.jupiter.api.extension.ExtendWith;
import util.TestRule;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features") // Caminho das features em src/test/resources/features
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "steps") // Pacote onde estão os steps
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-report.html") // Relatório HTML
@ExtendWith(TestRule.class)
public class RunTest {
    // Classe Runner vazia - controlada por annotations
}
