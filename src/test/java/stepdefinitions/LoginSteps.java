package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

    private WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Given("que acesso a página de login")
    public void acessoPaginaLogin() {
        driver.get("https://automationexercise.com/"); // Coloque a URL real aqui
        System.out.println("Título da página: " + driver.getTitle());

        // Ajuste o texto "Login" para algo que exista no título da sua página
        if (!driver.getTitle().contains("Automation Exercise")) {
            throw new RuntimeException("Título da página de login não corresponde!");
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
