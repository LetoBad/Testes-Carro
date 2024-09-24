package testesap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SuspensaoTest {

    Suspensao suspensao;

    @Test
    public void AjustarAlturaTest() {
        suspensao = new Suspensao("Hidraulica", "Aluminio", 15.0, 7, "Fox", "usado");
        suspensao.AjustarAltura(20);
        assertEquals(20.0, suspensao.getAltura(), "A altura da suspensao deve ser ajustada para 20");
    }

    @Test
    public void VerificarEstadoTest() {
        suspensao = new Suspensao("Hidraulica", "Aluminio", 15.0, 7, "Fox", "usado");
        String estadoEsperado = "usado";
        assertEquals(estadoEsperado, suspensao.getEstado(), "O estado da suspensao deve ser usado");
    }
}