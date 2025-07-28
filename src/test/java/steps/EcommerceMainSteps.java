package steps;

import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.TestRule;

import java.util.List;

public class EcommerceMainSteps {

    WebDriver driver = TestRule.getDriver();

    @Quando("pesquiso o produto {string}")
    public void pesquisarProduto(String produto) {
        WebElement searchField = driver.findElement(By.id("search_query_top"));
        searchField.clear();
        searchField.sendKeys(produto);

        WebElement searchButton = driver.findElement(By.name("submit_search"));
        searchButton.click();
    }

    @Entao("a pesquisa deve retornar resultados")
    public void validarPesquisaRetornouResultados() {
        List<WebElement> resultados = driver.findElements(By.cssSelector(".product_list .product-container"));

        Assertions.assertFalse(resultados.isEmpty(), "A pesquisa não retornou nenhum resultado!");
    }
}
