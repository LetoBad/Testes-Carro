package testesap;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarroTest {
    private carro Carroo;
    private Banco banco;
    private Combustivel combustivel;
    private Direcao direcao;
    private Freios freios;
    private Luzes luzes;
    private Motor motorr;
    private Painel painel;
    private Pneus pneus;
    private Pneus pneusReserva;
    private Portas portas;
    private SistemaEletrico eletrico;
    private Suspensao suspensao;
    private Transmisao transmisao;
    private LuzesFreio luzesFreio;
    private Alarma alarma;
    private ChaveCarro chave;

    @BeforeEach
    public void setUp(){
        banco = new Banco(2, "Couro", "Preto", "Deportivo", "Reto" , 2);
        combustivel = new Combustivel("Gasolina", 50, 0, "Ipirango", true);
        direcao = new Direcao("Deportiva", true, "Carbono", 12.2, "Sparco", 0);
        freios = new Freios("Pastilha", "Aço", "NSX", 10, 20);
        luzes = new Luzes("Led", 10, "Branca", false, "Led");
        motorr = new Motor("Teste", 1000, 12.0, "Porsche", false);
        painel = new Painel("Digital", "Normal", true, "Porsche", true, "");
        pneus = new Pneus("20/14", "Assetto", 22.0, "Michellini", "Bom");
        portas = new Portas(2, "Fibra", "Vermelho", "Normal", false);
        eletrico = new SistemaEletrico(12, 90, "Litio", false, "Mora");
        suspensao = new Suspensao("Barra invertida", "Carbono", 20, 10, "Sparco", "Bom");
        transmisao = new Transmisao("Manual" , 6 , "Aluminio", "Porsche" , true , 2);
        luzesFreio = new LuzesFreio("Led", 0, "Vermelha", false, "Luz de freio");
        alarma = new Alarma(false);
        chave = new ChaveCarro(70);
        Carroo = new carro(banco, combustivel, direcao, freios, luzes, motorr, painel, pneus, portas, eletrico, suspensao, transmisao,luzesFreio , alarma , chave ,"Porsche", 2019, "Branco", "Fak-2029", 10);
        pneusReserva = new Pneus("19/15", "Corssa", 27.0, "Pirelli", "Bom");
    }

    @Test
    public void SistemaEletricoTest() {
        eletrico.verificarBateria();
        eletrico.testarSistema();
        eletrico.ativarParteEletrica(eletrico);
        assertTrue(eletrico.verificar(), "O sistema elétrico deve estar funcionando corretamente.");
        
        eletrico.desativarParteEletrica();
        assertFalse(eletrico.verificar(), "O sistema elétrico deve estar desativado.");
        
        eletrico.ativarParteEletrica(eletrico);
        assertTrue(eletrico.verificar(), "O sistema elétrico deve estar ativado novamente.");
    }


    @Test
    void ComponentesTest() {
        Combustivel combustivel = new Combustivel("Gasolina", 50, 10, "Shell", true);
        Direcao direcao = new Direcao("Hidráulica", true, "Alumínio", 15.0, "Momo", 0);
        Freios freios = new Freios("Disco", "Metal", "PNY", 30, 50);
        Luzes luzes = new Luzes("LED", 75, "Branco", false, "Led");
        Pneus pneus = new Pneus("R16", "Assetto", 32.0, "Pirelli", "Novo");
        Portas portas = new Portas(2, "Metal", "Preto", "Comun", false);
        Transmisao transmissao = new Transmisao("Manual", 5, "Aço", "Porsche", true, 1);

        assertAll("Testando todos os componentes",
            () -> assertEquals(10, combustivel.getNivel(), "O nível do combustivel deve ser 10."),
            () -> assertEquals(0, direcao.getAngulo(), "O angulo inicial deve ser 0."),
            () -> assertTrue(freios.verificarDesgaste() < 90, "O desgaste deve ser inferior a 90 após verificacao."),
            () -> assertFalse(luzes.isEstado(), "As luzes devem estar desligadas."),
            () -> assertEquals("Novo", pneus.getEstado(), "Os pneus devem estar em estado 'Novo'."),
            () -> assertEquals(2, portas.getQuantidade(), "Deve haver 4 portas."),
            () -> assertEquals(1, transmissao.getMarchaAtual(), "A marcha inicial deve ser 1.")
        );
    }


    @Test
    public void AbastecerCarroVerificarNivelTest() {
        combustivel.abastecer(1);
        motorr.ligarMotor(combustivel, eletrico);
        assertTrue(motorr.getEstado(), "O motor deveria ligar");
    }

    @Test
    public void LuzComSistemaEletricoTest() {
        eletrico.ativarParteEletrica(eletrico);
        luzes.ligar(eletrico);
        assertTrue(luzes.isEstado(), "As luzes devem estar ligadas quando o sistema elétrico está ativo.");
    }

    
    @Test
    public void PressaoPneuTest() {
        assertEquals(22.0, pneus.getPressao(), "A pressao do pneu nao foi ajustada corretamente.");
        freios.freiar(luzesFreio, pneus, suspensao);
        assertEquals(23.0, pneus.getPressao(), "A pressao do pneu nao foi ajustada corretamente.");
    }

    @Test
    public void PortasEConexaoComLuzesTest() {
        portas.abrir(luzes, eletrico);
        assertTrue(portas.getEstado(), "As portas devem estar abertas.");
        assertTrue(luzes.isEstado(), "As luzes devem estar ligadas quando as portas estão abertas.");
        
        portas.fechar(luzes, eletrico);
        assertFalse(portas.getEstado(), "As portas devem estar fechadas.");
        assertFalse(luzes.isEstado(), "As luzes devem estar desligadas quando as portas estão fechadas.");
    }

    @Test
    public void FreiosLuzTest() {
        freios.freiar(luzesFreio , pneus, suspensao);
        luzesFreio.ajustarIntensidade(1, eletrico);
        assertTrue(luzesFreio.isEstado(), "As luzes devem ligar.");
    }

    @Test
    public void AjustarIntensidadeLuzTest() {
    luzes.ajustarIntensidade(80, eletrico);
    assertEquals(80, luzes.getIntensidade(), "A intensidade da luz nao foi ajustada corretamente");
        
    }

    @Test
    public void NaoLigarMotorSemCombustivelTest() {
        motorr.ligarMotor(combustivel, eletrico);
        assertFalse(motorr.verificarEstado(), "O motor nao liga devido à falta de combustível ou sistema eletrico");
    }


    @Test
    public void MotorImpactaTrocaMarchaTest() {
        Carroo.abastecerCarro(1);
        eletrico.ativarParteEletrica(eletrico);
        motorr.ligarMotor(combustivel, eletrico);
        transmisao.setEstado(true);
        transmisao.trocarMarcha(2, motorr);
        assertTrue(motorr.verificarEstado(), "O motor deve estar ligado para que a troca de marcha funcione.");
        assertNotNull(transmisao.getTipo(), "O tipo de transmissão não deve ser nulo após a troca de marcha.");
    }

    @Test
    public void AtualizaPainelComCombustivelTest() {
        double vel = Carroo.getVelocidade();
        combustivel.abastecer(20);
        assertEquals(20, combustivel.getNivel(), "O nível de combustível nao foi atualizado corretamente.");
        painel.atualizarInformacoes(motorr, combustivel, luzes, portas, suspensao, banco, eletrico, vel);
        painel.ligarDisplay();
        Boolean painelStatus = painel.getEstado();
        assertNotNull(painelStatus, "O status do painel não deve ser nulo após o abastecimento.");
    }

    @Test
    public void CarroAceleraGastaCombustivelTest(){
        Carroo.abastecerCarro(2);
        motorr.ligarMotor(combustivel, eletrico);
        Carroo.acelerar50(pneus, combustivel);
        assertEquals(1, combustivel.getNivel());
        Carroo.abastecerCarro(1);
        Carroo.acelerar100(pneus, combustivel);
        assertEquals(0, combustivel.getNivel());
    }

    @Test
    public void AceleraMudaPressaoPneuTest(){
        pneus.ajustarPressao(30);
        assertEquals(30, pneus.getPressao());
        Carroo.abastecerCarro(10);
        Carroo.acelerar50(pneus, combustivel);
        assertEquals(31, pneus.getPressao());
        Carroo.acelerar100(pneus, combustivel);
        assertEquals(33, pneus.getPressao());

    }

    @Test
    public void PneuReservaTest(){
        assertNotSame(pneus, pneusReserva , "Os pneus Nao sao os mesmos");
    }

    @Test
    public void FreiaDesceSuspensaoTest(){
        suspensao.AjustarAltura(10);
        assertEquals(10, suspensao.getAltura());
        freios.freiar(luzesFreio, pneus, suspensao);
        assertEquals(9, suspensao.getAltura());
    }

    @Test
    public void BancoEsquentatest(){
            banco.esquentarbanco(eletrico, 20);
            assertEquals(20, banco.getTemperatura());
            banco.esquentarbanco(eletrico, 23);
            assertEquals(23, banco.getTemperatura());
    }

    @Test
    public void AtivarModoPilotoAutomaticoTest(){
        direcao.AtivarModoPilotoAutomatico(eletrico);
        assertTrue(direcao.isAutomatico());
    }

    @Test
    public void DestivarModoPilotoAutomaticoTest(){
        direcao.DesativarModoPilotoAutomatico(eletrico);
        assertFalse(direcao.isAutomatico());
    }

    @Test
    public void LigarAlarmaTest(){
        assertFalse(alarma.isEstado());

        chave.ControleLigaAlarma(eletrico, alarma);
        assertTrue(alarma.isEstado());
    }

    @Test
    public void DesligarAlarmaTest(){
        assertFalse(alarma.isEstado());
        chave.ControleLigaAlarma(eletrico, alarma);
        assertTrue(alarma.isEstado());
        chave.ControleDesligaAlarma(eletrico, alarma);
        assertFalse(alarma.isEstado());
    }


    
    
    
}