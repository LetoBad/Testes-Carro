package testesap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SistemaEletricoTest {

    SistemaEletrico sistemaEletrico;

    @Test
    public void VerificarBateriaBoaTest() {
        sistemaEletrico = new SistemaEletrico(12.0, 80.0, "lítio", true, "Tesla");
        sistemaEletrico.verificarBateria();
        assertTrue(sistemaEletrico.getCapacidade() > 20, "A bateria deve estar em bom estado com mais de 20% de capacidade");
    }

    @Test
    public void SubstituirBateriaTest() {
        sistemaEletrico = new SistemaEletrico(12.0, 10.0, "lítio", true, "Tesla");
        sistemaEletrico.substituirBateria();
        assertEquals(100, sistemaEletrico.getCapacidade(), "A capacidade da bateria deveria ser 100%");
    }
}
