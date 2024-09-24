package testesap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PneusTest {

    Pneus pneus;


    @Test
    public void AjustarPressaoValidaTest() {
        pneus = new Pneus("R18", "Todo-terreno", 30.0, "Michelin", "usado");
        pneus.ajustarPressao(35.0);
        assertEquals(35.0, pneus.getPressao(), "A pressao dos pneus deve ser ajustada para 35 PSI.");
    }

    
    @Test
    public void AjustarPressaoInvalidaTest() {
        pneus = new Pneus("R18", "Todo-terreno", 30.0, "Michelin", "usado");
        pneus.ajustarPressao(60.0);
        assertEquals(30.0, pneus.getPressao(), "A pressao dos pneus não deve mudar para um valor invalido.");
    }

}