package testesap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
public class LuzesTest {

    Luzes luzes;

    @Test
    public void LigarLuzesTest() {
        luzes = new Luzes("LED", 50, "Branco", false, "Philips");
        System.out.println("Test pra ligar luzes");
        luzes.ligar();
        assertTrue(luzes.isEstado(), "As luzes devem ligarse");
    }

    
    @Test
    public void AjustarIntensidadeTest() {
        luzes = new Luzes("LED", 50, "Branco", true, "Philips");
        System.out.println("Test de ajustar intensidade e verificar que nao ajuste a intensidade pra um numero negativo");
        luzes.ajustarIntensidade(80);
        assertEquals(80, luzes.getIntensidade(), "A intensidade = 80%.");
        luzes.ajustarIntensidade(-10);
        assertEquals(80, luzes.getIntensidade(), "A intensidade das luzes não deve mudar após um valor inválido.");
    }
}
