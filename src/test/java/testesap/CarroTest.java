package testesap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CarroTest {
        Banco banco = new Banco(2, "Couro", "Preto", "Deportivo", "Reto" , 2);
        Combustivel combustivel = new Combustivel("Gasolina", 50, 10, "Ipirango", true);
        Direcao direcao = new Direcao("Deportiva", true, "Carbono", 12.2, "Sparco", 0);
        Freios freios = new Freios("Pastilha", "Aço", "NSX", 10, 20);
        Luzes luzes = new Luzes("Led", 10, "Branca", true, "Led");
        Motor motorr = new Motor("Teste", 1000, 12.0, "MARCA", true);
        Painel painel = new Painel("Digital", "Normal", true, "Porsche", true, "");
        Pneus pneus = new Pneus("20/14", "Assetto", 22.0, "Michellini", "Bom");
        Portas portas = new Portas(2, "Fibra", "Vermelho", "Normal", false);
        SistemaEletrico eletrico = new SistemaEletrico(12, 90, "Litio", true, "Mora");
        Suspensao suspensao = new Suspensao("Barra invertida", "Carbono", 20, 10, "Sparco", "Bom");
        Transmisao transmisao = new Transmisao("Manual" , 6 , "Aluminio", "Porsche" , true);
        carro Carroo = new carro(banco, combustivel, direcao, freios, luzes, motorr, painel, pneus, portas, eletrico, suspensao, transmisao, null, 0, null, null, 0);
    


    @Test
    public void AbrirPortasLigaLuzTest(){
        portas.abrir(luzes, eletrico);
        assertTrue(luzes.isEstado());
    }

    @Test
    public void AjustarAlturaTest() {
        suspensao.AjustarAltura(20);
        assertEquals(20.0, suspensao.getAltura(), "A altura da suspensao deve ser ajustada para 20");
    }


}