package testesap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PainelTest {
    Painel painel;

    @Test
    public void LigarDesligarDisplayTest() {
        painel = new Painel("Digital", "LCD", false, "Porsche", false, "Direita");
        assertFalse(painel.getEstado(), "El display deberia estar desligado inicialmente.");
        painel.ligarDisplay();
        assertTrue(painel.getEstado(), "El display deberia estar ligado");
        painel.ligarDisplay();
        assertTrue(painel.getEstado(), "El display deberia permanecer ligado.");
        painel.desligarDisplay();
        assertFalse(painel.getEstado(), "El display deberia estar desligado");
        painel.desligarDisplay();
        assertFalse(painel.getEstado(), "El display debería permanecer desligado.");
    }



}
