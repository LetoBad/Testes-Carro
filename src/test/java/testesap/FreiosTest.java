package testesap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class FreiosTest {

    Freios freios;
    @Test
    void VerificarDesgastetest() {
        Freios freios = new Freios("Patilha", "Carbono", "Sparco", 10, 20);
        System.out.println("Test Desgaste");
        double desgaste = freios.verificarDesgaste();
        double esperado = 20;
        assertEquals(esperado, desgaste, "O desgaste deveria ser de 20%");
    }

    @Test
    void VerificarDesgastetest2() {
        Freios freios = new Freios("Patilha", "Carbono", "Sparco", 10, 20);
        System.out.println("test desgaste 2");
        double desgaste = freios.verificarDesgaste();
        assertNotNull(desgaste);
    }
}