package testesap;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

public class TestsPorsche {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Reemplaza con tu ruta de ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
public void NavegacionPrincipalTest() {
    WebElement menuModelos = driver.findElement(By.id("menu-modelos"));
    WebElement menuConfiguracion = driver.findElement(By.id("menu-configuracion"));
    WebElement menuConcesionarios = driver.findElement(By.id("menu-concesionarios"));

    // Validar que los elementos están visibles
    assertTrue(menuModelos.isDisplayed(), "El menú de Modelos debe estar visible");
    assertTrue(menuConfiguracion.isDisplayed(), "El menú de Configuración debe estar visible");
    assertTrue(menuConcesionarios.isDisplayed(), "El menú de Concesionarios debe estar visible");

    // Validar interacciones
    menuModelos.click();
    assertEquals(driver.getCurrentUrl(), "https://porsche.com/modelos", "Debe redirigir a la página de Modelos");
}

@Test
public void SelectorModelosTest() {
    driver.get("https://porsche.com/modelos");

    // Seleccionar filtros
    WebElement filtroPrecio = driver.findElement(By.id("filtro-precio"));
    WebElement filtroCombustible = driver.findElement(By.id("filtro-combustible"));

    filtroPrecio.sendKeys("100000");
    filtroCombustible.click();
    WebElement opcionElectrico = driver.findElement(By.id("combustible-electrico"));
    opcionElectrico.click();

    // Validar los resultados
    List<WebElement> modelosFiltrados = driver.findElements(By.className("modelo-item"));
    assertFalse(modelosFiltrados.isEmpty(), "Debe mostrar al menos un modelo con los filtros aplicados");
}

@Test
public void testPersonalizacionVehiculo() {
    driver.get("https://porsche.com/configurador");

    // Seleccionar modelo base
    WebElement modeloBase = driver.findElement(By.id("modelo-base-911"));
    modeloBase.click();

    // Personalizar colores
    WebElement colorExterior = driver.findElement(By.id("color-exterior"));
    colorExterior.click();
    WebElement opcionRojo = driver.findElement(By.id("color-rojo"));
    opcionRojo.click();

    // Validar el precio
    WebElement precioActual = driver.findElement(By.id("precio-actual"));
    assertEquals(precioActual.getText(), "$120,000", "El precio debe actualizarse correctamente");
}

@Test
public void testLocalizadorConcesionarios() {
    driver.get("https://porsche.com/concesionarios");

    // Buscar por código postal
    WebElement campoBusqueda = driver.findElement(By.id("busqueda-cp"));
    campoBusqueda.sendKeys("12345");
    WebElement botonBuscar = driver.findElement(By.id("btn-buscar"));
    botonBuscar.click();

    // Validar resultados
    List<WebElement> concesionarios = driver.findElements(By.className("concesionario-item"));
    assertFalse(concesionarios.isEmpty(), "Debe mostrar al menos un concesionario en los resultados");
}

@Test
public void testRegistroUsuario() {
    driver.get("https://porsche.com/registro");

    // Completar formulario de registro
    WebElement inputNombre = driver.findElement(By.id("nombre"));
    WebElement inputEmail = driver.findElement(By.id("email"));
    WebElement inputPassword = driver.findElement(By.id("password"));
    WebElement botonRegistrar = driver.findElement(By.id("btn-registrar"));

    inputNombre.sendKeys("Juan Perez");
    inputEmail.sendKeys("juan.perez@example.com");
    inputPassword.sendKeys("SecurePassword123");
    botonRegistrar.click();

    // Validar que el registro fue exitoso
    WebElement mensajeExito = driver.findElement(By.className("mensaje-exito"));
    assertEquals(mensajeExito.getText(), "Registro completado con éxito", "El mensaje de éxito debe mostrarse correctamente");
}





    
}
