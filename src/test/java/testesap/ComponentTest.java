package testesap;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ComponentTest extends BaseTest {

    @Test
    public void MainMenuVisibilidadTest() {
        driver.get("https://www.porsche.com");
        boolean isMenuVisible = driver.findElement(By.id("nav-main")).isDisplayed();
        assertTrue(isMenuVisible, "El menú principal no está visible.");
    }

    @Test
    public void SearchFunctionalidadTest() {
        driver.get("https://www.porsche.com");
        driver.findElement(By.id("nav-search")).click();
        driver.findElement(By.id("search-input")).sendKeys("911");
        boolean isSearchVisible = driver.findElement(By.id("search-result")).isDisplayed();
        assertTrue(isSearchVisible, "El resultado de búsqueda no está visible.");
    }

    @Test
    public void NavigateToModelosCatalogoTest() {
        driver.get("https://www.porsche.com");
        driver.findElement(By.linkText("Modelos")).click();
        assertTrue(driver.getCurrentUrl().contains("modelos"), "No se redirigió al catálogo de vehículos.");
    }

    @Test
    public void NoticiasVisibilityTest() {
        driver.get("https://www.porsche.com");
        driver.findElement(By.linkText("Noticias")).click();
        boolean isArticleVisible = driver.findElement(By.xpath("//div[contains(@class, 'news-item')]")).isDisplayed();
        assertTrue(isArticleVisible, "El artículo de noticias no está visible.");
    }


}

