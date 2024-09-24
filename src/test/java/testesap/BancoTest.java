package testesap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoTest {
    private Banco banco;

    @BeforeEach
    public void setUp() {
        banco = new Banco(5, "Madera", "Negro", "Banco de parque", "Nuevo");
    }

    @Test
    public void AjustarAlturaTest() {
        banco.ajustarAltura(1.5);
        assertEquals(1.5, banco.getAltura(), "La altura debería ser ajustada a 1.5 metros.");

        banco.ajustarAltura(2.5);
        assertEquals(1.5, banco.getAltura(), "La altura no debería cambiar al intentar ajustar a un valor inválido.");
    }
}
