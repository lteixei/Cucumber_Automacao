package tests;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import util.TestRule;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features") // Caminho das features em src/test/resources/features
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "steps") // Pacote onde estão os steps
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-report.html") // Relatório HTML
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@run")
@ExtendWith(TestRule.class)
public class RunTest {
    // Classe Runner vazia - controlada por annotations
}
