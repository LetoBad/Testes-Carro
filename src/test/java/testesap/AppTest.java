package testesap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

class AppTest {
    //private carro c;
    private static Painel p;
    private static Combustivel comb;
    private static Direcao dir;
    private static Portas port;
    private static Motor mot;
    private static Luzes luzes;
    private static Freios fre;
    private static Banco bancos;
    private static Pneus pneus;
    private static Suspensao suspensao;
    private static Transmisao trans;
    private static SistemaEletrico sistemaeletrico;
    

    @BeforeAll
    public static void setUpClass() {
        // c = new Carro();
        comb = new Combustivel("Gasolina", 70.0, 10, "x", true);
        p = new Painel("Digital", "Normal", true, "Porsche", true);
        dir = new Direcao("Assistida", true, "Carbono", 2.7, "Momo" , 0);
        port = new Portas(2, "Fibra", "Vermelho", "Normal", "Fechada");
        sistemaeletrico = new SistemaEletrico(12, 90, "Litio", true, "Mora");
        mot = new Motor("V8", 510, 2.8, "Porsche", true);
        trans = new Transmisao(1, "Manual" , 6 , "Aluminio", "Porsche" , true);
        fre = new Freios("Pastilha", "Fibra", "Pirelli", 10.0, 0);
        suspensao = new Suspensao("Barra invertida", "Carbono", 20, 10, "Sparco", "Bom");
        luzes = new Luzes("Farol", 10, "Branca", true, "LED");
        pneus = new Pneus("20/14", "Assetto", 22.0, "Michellini", "Bom");
        bancos = new Banco(2, "Coro", "Preto", "Competicao", "Otimo");


    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {


    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void painelTest() {
        System.out.println("Inicialização do carro");
        // tipo
        String tipo = p.getTipo();
        System.out.println("Resultado" + tipo);
        assertEquals("Digital", tipo);
        // display
        String display = p.getDisplay();
        System.out.println("Resultado" + display);
        assertEquals("Normal", display);
        // controle
        boolean controle = p.getControle();
        System.out.println("Resultado" + controle);
        assertEquals(true, controle);
        // marca
        String marca = p.getMarca();
        System.out.println("Resultado" + marca);
        assertEquals("Porsche", marca);
        // estado
        boolean estado = p.getEstado();
        System.out.println("Resultado" + estado);
        assertEquals(true, estado);
    }

    @Test
    public void CombustivelTest() {
        System.out.println("Test Combustivel");
        // tipo
        String tipo = comb.getTipo();
        System.out.println("Resultado" + tipo);
        assertEquals("Gasolina", tipo);
        // capacidade
        double capacidade = comb.getCapacidade();
        System.out.println("Resultado" + capacidade);
        assertEquals(70.0, capacidade);
        // nivel
        double nivel = comb.getNivel();
        System.out.println("Resultado" + nivel);
        assertEquals(10.0, nivel);
        // marca
        String marca = comb.getMarca();
        System.out.println("Resultado" + marca);
        assertEquals("x", marca);
        // estado
        boolean estado = comb.getEstado();
        System.out.println("Resultado" + estado);
        assertEquals(true, estado);
    }

    @Test
    public void DirecaoTest() {
        System.out.println("Teste de Direcao");
        // tipo
        String tipo = dir.getTipo();
        System.out.println("Resultado" + tipo);
        assertEquals("Assistida", tipo);
        // assistido
        boolean assistido = dir.getAssistido();
        System.out.println("Resultado" + assistido);
        assertEquals(true, assistido);
        // material
        String material = dir.getMaterial();
        System.out.println("Resultado" + material);
        assertEquals("Carbono", material);
        // relacao
        double relacao = dir.getRelacion();
        System.out.println("Resultado" + relacao);
        assertEquals(2.7, relacao);
        // marca
        String marca = dir.getMarca();
        System.out.println("Resultado" + marca);
        assertEquals("Momo", marca);
    }

    @Test
    public void PortasTest() {
        System.out.println("Teste Porta");
        // quantidade
        int quantidade = port.getQuantidade();
        System.out.println("Resultado" + quantidade);
        assertEquals(2, quantidade);
        // array Material - cor - tipo - estado
        System.out.println("Array equals");
        String[] arrayEsperado={"Fibra","Vermelho" , "Normal" , "Fechada"};
        String[] arrayAtual = {port.getMaterial() , port.getCor() , port.getTipo() , port.getEstado() };
        assertArrayEquals(arrayEsperado, arrayAtual);
    }

    @Test
    public void sistemaEletrico() {
        System.out.println("Teste Sistema Eletrico");
        // Voltagem
        double voltagem = sistemaeletrico.getVoltagem();
        System.out.println("Resultado" + voltagem);
        assertEquals(12, voltagem);
        // capacidade
        double capacidade = sistemaeletrico.getCapacidade();
        System.out.println("Resultado" + capacidade);
        assertEquals(90, capacidade);
        // tipo
        String tipo = sistemaeletrico.getTipoBateria();
        System.out.println("Resultado" + tipo);
        assertEquals("Litio", tipo);
        // estado
        boolean estado = sistemaeletrico.getEstado();
        System.out.println("Resultado" + estado);
        assertEquals(true, estado);
        // marca
        String marca = sistemaeletrico.getMarca();
        System.out.println("Resultado" + marca);
        assertEquals("Mora", marca);
    }

    @Test
    public void motorTest() {
        System.out.println("Teste Motor");
        // tipo
        String tipo = mot.getTipo();
        System.out.println("Resultado " + tipo);
        assertEquals("V8", tipo);
        // potencia
        int potencia = mot.getPotencia();
        System.out.println("Resultado " + potencia);
        assertEquals(510, potencia);
        // cilindrada
        double cilindrada = mot.getCilindrada();
        System.out.println("Resultado " + cilindrada);
        assertEquals(2.8, cilindrada);
        // marca
        String marca = mot.getMarca();
        System.out.println("Resultado " + marca);
        assertEquals("Porsche", marca);
        // estado
        boolean estado = mot.getEstado();
        System.out.println("Resultado" + estado);
        assertEquals(true, estado);

    }

    @Test
    public void transmisaoTest(){
        System.out.println("Test Transmissão");
        //marcha atual
        int marcha = trans.getMarchaAtual();
        System.out.println("Resultado" + marcha);
        assertEquals(1, marcha);
        //numero marchas
        int numeromarchas = trans.getNumeroMarchas();
        System.out.println("Resultado" + numeromarchas);
        assertEquals(6, numeromarchas);
        // array Material - Marca - tipo
        System.out.println("Array equals");
        String[] arrayEsperado={"Manual","Aluminio" , "Porsche"};
        String[] arrayAtual = {trans.getTipo() , trans.getMaterial() , trans.getMarca() };
        assertArrayEquals(arrayEsperado, arrayAtual);
        //estado
        boolean estado = mot.getEstado();
        System.out.println("Resultado" + estado);
        assertEquals(true, estado);
    }

    @Test
    public void freiosTest(){
        System.out.println("Test freio");
        // tipo - material - marca
        List<String> Esperado = Arrays.asList("Pastilha" , "Fibra" , "Pirelli");
        List<String> Resultado = Arrays.asList(fre.getTipo() , fre.getMaterial() , fre.getMarca());
        assertIterableEquals(Esperado, Resultado);
        // tamanho - nivel desgaste
        double[] esperadoDouble = {10.0 , 0};
        double[] resultadoDouble = {fre.getTamanho() , fre.getDesgaste()};
        assertArrayEquals(esperadoDouble, resultadoDouble);
    }

    @Test
    public void suspensaoTest(){
        System.out.println("test suspensao");
        //tipo material marca estado
        String[] arrayEsperado={"Barra invertida","Carbono" ,"Sparco" , "Bom"};
        String[] arrayresultado={suspensao.getTipo(), suspensao.getMaterial(), suspensao.getMarca(), suspensao.getEstado()};
        assertArrayEquals(arrayEsperado, arrayresultado);
        //altura - rigidez
        double altura = suspensao.getAltura();
        System.out.println("Resultado" + altura);
        assertEquals(20, altura);
        double rigidez = suspensao.getRigidez();
        System.out.println("Resultado" + rigidez);
        assertEquals(10, rigidez);

    }

    @Test
    public void luzesTest(){
        System.out.println("Test Luces");
        //tipo color modelo
        List<String> Esperado = Arrays.asList("Farol" , "Branca" , "LED");
        List<String> Resultado = Arrays.asList(luzes.getTipo() , luzes.getCor() , luzes.getModelo());
        assertIterableEquals(Esperado, Resultado);
        //intensidad - estado 
        double intensidad = luzes.getIntensidade();
        System.out.println("Resultado" + intensidad);
        assertEquals(10, intensidad);
        boolean estado = luzes.isEstado();
        System.out.println("Resultado" + estado);
        assertEquals(true, estado);
    }

    @Test
    public void pneusTest(){
        System.out.println("Pneus Test");
        //tamanho tipo marca
        String[] arrayEsperado={"20/14","Assetto" ,"Michellini" , "Bom"};
        String[] arrayresultado={pneus.getTamanho(), pneus.getTipo(), pneus.getMarca(), pneus.getEstado()};
        assertArrayEquals(arrayEsperado, arrayresultado);
        //pressao
        double pressao = pneus.getPressao();
        System.out.println("Resultado" + pressao);
        assertEquals(22, pressao);
    }

    @Test
    public void bancosTest(){
        System.out.println("Test Bancos");
        //material - color - Otimo
        String[] arrayEsperado={"Coro","Preto", "Competicao" ,"Otimo"};
        String[] arrayresultado={bancos.getMaterial(), bancos.getCor(), bancos.getTipo(),bancos.getEstado()};
        assertArrayEquals(arrayEsperado, arrayresultado);
        //quantidade
        int quantidade = bancos.getQuantidade();
        System.out.println("Resultado" + quantidade);
        assertEquals(2, quantidade);
        //
    }

    

}
