package testesap;

public class Main {
    public static void main(String[] args) {

        Banco sistemaBanco = new Banco(2, "Couro", "Preto", "Deportivo", "Reto" , 2);
        Combustivel sistemaCombustivel = new Combustivel("Gasolina", 50, 10, "Ipirango", true);
        Direcao sistemaDirecao = new Direcao("Deportiva", true, "Carbono", 12.2, "Sparco", 0);
        Freios sistemaFreios = new Freios("Pastilha", "Aço", "NSX", 10, 20);
        Luzes sistemaLuzes = new Luzes("Led", 10, "Branca", true, "Led");
        Motor motor = new Motor("Teste", 1000, 12.0, "MARCA", true);
        Painel sistemaPainel = new Painel("Digital", "Normal", true, "Porsche", true, "");
        Pneus sistemaPneus = new Pneus("20/14", "Assetto", 22.0, "Michellini", "Bom");
        Portas sistemaPortas = new Portas(2, "Fibra", "Vermelho", "Normal", false);
        SistemaEletrico sistemaEletrico = new SistemaEletrico(12, 90, "Litio", true, "Mora");
        Suspensao sistemaSuspensao = new Suspensao("Barra invertida", "Carbono", 20, 10, "Sparco", "Bom");
        Transmisao transmissao = new Transmisao("Manual" , 6 , "Aluminio", "Porsche" , true , 1);
        LuzesFreio luzesFreio = new LuzesFreio("Led", 10, "Vermelha", false, "Luz de freio");


        carro Carro = new carro(sistemaBanco , sistemaCombustivel, sistemaDirecao, sistemaFreios, sistemaLuzes, motor , sistemaPainel , sistemaPneus , sistemaPortas
        , sistemaEletrico , sistemaSuspensao , transmissao ,luzesFreio , "Porsche" , 2019 , "Branco" , "FAN-2020" , 0 );

        
       /*  Carro.abastecerCarro(10);
        Carro.abrirPorta();
        Carro.verificarNivel();
        Carro.verificarBateria();
        Carro.verificarEstadoMotor();
        Carro.verificarEstadoDirecao();
        Carro.verificarDesgaste();
        Carro.verificarEstadoTransmissao();
        Carro.verificarEstadoSuspensao();
        Carro.ajustarPressao(30);
        Carro.ajustarAlturaSuspensao(2);
        Carro.ajustarIntensidade(20, sistemaEletrico);
        Carro.ajustarAlturaBanco(2);
        Carro.ajustarEncostoBanco("Reto");
        Carro.fecharPorta();
        Carro.ligar();
        Carro.ligarDisplay();
        Carro.ligandoLuzes(true);
        Carro.desligar();

        sistemaLuzes.ligar(sistemaEletrico);*/

        motor.ligarMotor(sistemaCombustivel, sistemaEletrico);
        sistemaFreios.freiar(luzesFreio, sistemaPneus, sistemaSuspensao);

    }
}
