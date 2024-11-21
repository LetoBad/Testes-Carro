package testesap;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ComponentTest extends BaseTest {

    @Test
    public void testMainMenuVisibility() {
        driver.get("https://www.porsche.com");
        boolean isMenuVisible = driver.findElement(By.id("nav-main")).isDisplayed();
        assertTrue(isMenuVisible, "El menú principal no está visible.");
    }

    @Test
    public void testSearchFunctionality() {
        driver.get("https://www.porsche.com");
        driver.findElement(By.id("nav-search")).click();
        driver.findElement(By.id("search-input")).sendKeys("911");
        boolean isSearchVisible = driver.findElement(By.id("search-result")).isDisplayed();
        assertTrue(isSearchVisible, "El resultado de búsqueda no está visible.");
    }

    @Test
    public void testNavigateToVehiclesCatalog() {
        driver.get("https://www.porsche.com");
        driver.findElement(By.linkText("Modelos")).click();
        assertTrue(driver.getCurrentUrl().contains("modelos"), "No se redirigió al catálogo de vehículos.");
    }

    @Test
    public void testNewsArticleVisibility() {
        driver.get("https://www.porsche.com");
        driver.findElement(By.linkText("Noticias")).click();  // Ajustar el enlace si es necesario
        // Verifica que un artículo esté visible en la página de noticias
        boolean isArticleVisible = driver.findElement(By.xpath("//div[contains(@class, 'news-item')]")).isDisplayed();
        assertTrue(isArticleVisible, "El artículo de noticias no está visible.");
    }
}

