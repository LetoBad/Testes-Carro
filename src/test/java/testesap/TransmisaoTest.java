package testesap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TransmisaoTest {

    Transmisao transmissao;

    @Test
    public void TrocarMarchaValidaTest() {
        transmissao = new Transmisao(1, "Manual", 6, "Aço", "sei la", true);
        transmissao.trocarMarcha(3);
        assertEquals(3, transmissao.getMarchaAtual(), "A marcha atual deve ser 3.");
    }

    @Test
    public void VerificarEstadoTest() {
        transmissao = new Transmisao(1, "Manual", 6, "Aço", "sei la", true);
        assertTrue(transmissao.isEstado(), "A transmissão deve estar ativa.");
    }
}
