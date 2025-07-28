package util;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRule implements BeforeAllCallback, AfterAllCallback {

    private static WebDriver driver;

    @Override
    public void beforeAll(ExtensionContext context) {
        System.out.println(">>> Setup global executado");
        // Nenhuma navegação aqui — será feita no step
    }

    @Override
    public void afterAll(ExtensionContext context) {
        System.out.println(">>> TearDown global executado");
        fecharNavegador();
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void abrirNavegador(String url) {
        getDriver().get(url);
    }

    public static void fecharNavegador() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
