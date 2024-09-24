package testesap;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PortasTest {

    Portas portas;
    
    @Test
    public void portasAbertasTest(){
        portas = new Portas(2, "Fibra", "Vermelho", "Normal", "Fechada");
        System.out.println("Test verificar estado");
        String estado = portas.getEstado();
        String esperado = "Fechada";
        assertTrue(esperado.equals(estado));
    }

    @Test
    public void abrirPortaTest() {
        portas = new Portas(2, "Fibra", "Vermelho", "Normal", "Fechada");
        System.out.println("test abrir portas");
        portas.abrir();
        String estado = portas.getEstado();
        String esperado = "Aberta";
        assertTrue(esperado.equals(estado));
    }


}
