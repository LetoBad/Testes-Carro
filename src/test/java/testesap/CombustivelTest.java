package testesap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CombustivelTest {

    Combustivel combustivel;


    @Test
    public void VerificarNivelTest() {
        combustivel = new Combustivel("Gasolina", 50, 10, "sei la", true);
        assertEquals(10, combustivel.getNivel(), "O nivel de combustivel deve ser 10 litros");
    }

    @Test
    public void AbastecerTest() {
        combustivel = new Combustivel("Gasolina", 50, 20, "sei la", true);
        combustivel.abastecer(15);
        assertEquals(35, combustivel.getNivel(), "O nivel de combustivel deve ser 35 litros");
    }

}
