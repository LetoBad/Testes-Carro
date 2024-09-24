package testesap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DirecaoTest {
    Direcao direcao;

    @Test
    public void VerificarEstadoAssistidoTest() {
        direcao = new Direcao("Eletrica", true, "Plastico", 12.0, "Momo", 30);
        System.out.println("Test verificaco asistido");
        
        assertTrue(direcao.getAssistido(), "O sistema deve estar assistido.");
    }
    
    @Test
    public void AjustarDirecaoValidoTest() {
        direcao = new Direcao("Eletrica", true, "Metal", 12.0, "Momo", 0);
        direcao.ajustarDirecao(90);
        assertEquals(90, direcao.getAngulo(), "O ângulo da direção deve ser 90 graus.");
    }



}
