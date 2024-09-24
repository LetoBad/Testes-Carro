package testesap;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarroTest {
    private carro carro;

    @BeforeEach
    public void setUp() {
        carro = new carro(false, 0);
    }

    @Test
    public void LigaCarroTest() {
        carro.combustible.abastecer(20);
        carro.porta.setEstado("Fechada");
        carro.sistemaeletrico.setEstado(true); 
        carro.motor.setEstado(true);
        carro.LigaCarro();
        assertTrue(carro.isEstado(), "El carro debería estar encendido después de ligar.");
    }

    @Test
    public void AcelerarTest() {
        carro.combustible.abastecer(20);
        carro.porta.setEstado("Fechada");
        carro.sistemaeletrico.setEstado(true);
        carro.motor.setEstado(true);
        carro.LigaCarro();
        carro.trans.subirMarcha();
        double velocidadAntes = carro.getVelocidade();
        carro.acelerar();
        assertTrue(carro.getVelocidade() > velocidadAntes, "La velocidad debería aumentar al acelerar.");
    }
}