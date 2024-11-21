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
}

