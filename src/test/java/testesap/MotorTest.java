package testesap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MotorTest {
    private Motor motor;
    private Combustivel combustivel;
    private SistemaEletrico sistemaEletrico;

    @BeforeEach
    public void setUp() {
        combustivel = new Combustivel("Gasolina", 70.0, 10, "Shell", true);
        sistemaEletrico = new SistemaEletrico(12, 90, "Litio", true, "Mora");
        motor = new Motor("V8", 510, 2.8, "Porsche", false);
    }

    @Test
    public void LigarMotorTest() {
        assertFalse(motor.getEstado(), "El motor debería estar desligado inicialmente.");
        if(motor.getEstado() == false && combustivel.getNivel() > 0 && sistemaEletrico.getEstado() == true){
        motor.ligarMotor();
        assertTrue(motor.getEstado(), "El motor debería estar ligado");
        }
        
    }

    @Test
    public void DesligarMotorTest() {
        motor.ligarMotor();
        assertTrue(motor.getEstado(), "El motor deberia estar ligado.");
        motor.desligarMotor();
        assertFalse(motor.getEstado(), "El motor debería estar desligado después de llamar a desligarMotor.");
        motor.desligarMotor();
        assertFalse(motor.getEstado(), "El motor debería seguir desligado.");
    }
}
