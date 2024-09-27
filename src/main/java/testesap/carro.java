package testesap;

public class carro {
    private Banco sistemaBanco;
    private Combustivel sistemaCombustivel;
    private Direcao sistemaDirecao;
    private Freios sistemaFreios;
    private Luzes SistemaLuzes;
    private Motor motor;
    private Painel sistemaPainel;
    private Pneus SistemaPneus;
    private Portas sistemaPortas;
    private SistemaEletrico sistemaEletrico;
    private Suspensao sistemaSuspensao;
    private Transmisao Transmissao;
    private LuzesFreio luzesFreio;
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private double velocidade;
    
    public carro(Banco sistemaBanco, Combustivel sistemaCombustivel, Direcao sistemaDirecao, Freios sistemaFreios,
            Luzes sistemaLuzes, Motor motor, Painel sistemaPainel, Pneus sistemaPneus, Portas sistemaPortas,
            SistemaEletrico sistemaEletrico, Suspensao sistemaSuspensao, Transmisao transmissao, LuzesFreio luzesFreio , String modelo, int ano,
            String cor, String placa, double velocidade) {
        this.sistemaBanco = sistemaBanco;
        this.sistemaCombustivel = sistemaCombustivel;
        this.sistemaDirecao = sistemaDirecao;
        this.sistemaFreios = sistemaFreios;
        //abajo
        this.SistemaLuzes = sistemaLuzes;
        this.motor = motor;
        this.sistemaPainel = sistemaPainel;
        //abajo
        this.SistemaPneus = sistemaPneus;
        this.sistemaPortas = sistemaPortas;
        this.sistemaEletrico = sistemaEletrico;
        this.sistemaSuspensao = sistemaSuspensao;
        //abajo
        this.Transmissao = transmissao;
        this.luzesFreio = luzesFreio;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.velocidade = velocidade;
    }

    public void vel(){
        double velocidadeAtual = Math.random() * 120;
        velocidade = velocidadeAtual;
    }
    

    //bancos
    public void ajustarAlturaBanco(double novaAltura){
        sistemaBanco.ajustarAltura(novaAltura);
    }

    public void setEstadoBanco(double var) {
        double value = var;
        sistemaBanco.setEstado(value);
    }

    public void ajustarEncostoBanco(String posicao){
        sistemaBanco.ajustarEncosto(posicao);
    }

    //combustivel
    public void abastecerCarro(double gasolina){
        sistemaCombustivel.abastecer(gasolina);
    }

    public void substituirTanque(String tipo, double capacidade, double nivel, String marca, boolean estado){
        sistemaCombustivel.substituirTanque(tipo, capacidade, nivel, marca, estado);
    }

    public void verificarNivel(){
        System.out.println("Nivel de combustivel: " + sistemaCombustivel.verificarNivel());
    }
    //direcao
    public void ajustarDirecao(double angulo){
        sistemaDirecao.ajustarDirecao(angulo);
    }

    public void verificarEstadoDirecao(){
        sistemaDirecao.verificarEstado();
    }

    public void substituirComponenteDirecao(String tipo, boolean assistido, String material, double relacion, String marca, double angulo){
        sistemaDirecao.substituirComponente(tipo, assistido, material, relacion, marca, angulo);
    }

    //freios
    public void ajustarFreios(double freioAjuste){
        sistemaFreios.ajustarFreio(freioAjuste);
    }

    public void substituirPastilha(){
        sistemaFreios.substituirPastilhas();
    }

    public void verificarDesgaste(){
        sistemaFreios.verificarDesgaste();
    }

    //luzes
    public void ligandoLuzes(boolean estado){
        SistemaLuzes.OnOff(estado, sistemaEletrico);
    }

    public void ajustarIntensidade(int novaIntensidade , SistemaEletrico eletrico){
        SistemaLuzes.ajustarIntensidade(novaIntensidade, eletrico);
    }

    
    //motor
    public void verificarEstadoMotor(){
        System.out.println("Estado do motor: " + motor.verificarEstado());
    }

    //painel
    public void ligarDisplay(){
        sistemaPainel.ligarDisplay();
    }

    public void desligarDisplay(){
        sistemaPainel.desligarDisplay();
    }

    //pneus
    public void substituirPneu(String tamanho, String tipo, double pressao, String marca, String estado){
        SistemaPneus.substituir(tamanho, tipo, pressao, marca, estado);
    }

    public void verificarPressao(){
        System.out.println("A pressao dos pneus é : " + SistemaPneus.verificarPressao());
    }

    public void ajustarPressao(double pressao){
        SistemaPneus.ajustarPressao(pressao);
    }

    //portas
    public void abrirPorta(){
        sistemaPortas.abrir(SistemaLuzes , sistemaEletrico);
    }

    public void fecharPorta(){
        sistemaPortas.fechar(SistemaLuzes, sistemaEletrico);
    }

    public void verificarEstadoPorta(){
        sistemaPortas.verificarEstado();
    }

    //sistema Eletrico
    public void verificarBateria(){
        sistemaEletrico.verificarBateria();
    }

    public void substituirBateria(Double voltagem, Double capacidade, String tipoDeBateria, Boolean estado, String marca) {
        sistemaEletrico.substituirBateria(voltagem, capacidade, tipoDeBateria, estado, marca);
    }

    public void testarSistemaEletrico(){
        sistemaEletrico.testarSistema();
    }

     //Suspensao
    public void ajustarAlturaSuspensao(double altura){
        sistemaSuspensao.AjustarAltura(altura);
    }

    public void verificarEstadoSuspensao(){
        sistemaSuspensao.VerificaEstado();
    }

    public void substituirSuspensao(String tipo, String material, double altura, int rigidez, String marca, String estado){
        sistemaSuspensao.substituir(tipo, material, altura, rigidez, marca, estado);
    }

    //Transmissao
    public void verificarEstadoTransmissao(){
        Transmissao.verificarEstado();
    }

    public void substituirComponenteTransmissao(String tipo, int numeroMarchas, String material, String marca, Boolean estado) {
        Transmissao.substituir(tipo, numeroMarchas, material, marca, estado);
    }

    public void trocarMarcha(int marcha){
        Transmissao.trocarMarcha(marcha, motor);
    }
    

    //liga desliga
    public void ligar(){
        motor.ligarMotor(sistemaCombustivel, sistemaEletrico);
        SistemaLuzes.ligar(sistemaEletrico);
    }

    public void desligar(){
        motor.desligarMotor();
        SistemaLuzes.desligaLuzes(sistemaEletrico);
    }

    public void acelerar50(Pneus sistemaPneus, Combustivel combustivel){
        motor.ligarMotor(sistemaCombustivel, sistemaEletrico);
        SistemaLuzes.ligar(sistemaEletrico);
        sistemaPneus.setPressao(sistemaPneus.getPressao()+1);
        combustivel.setNivel(combustivel.getNivel()-1);
        velocidade = 49;
    }

    public void acelerar100(Pneus sistemaPneus, Combustivel combustivel){
        motor.ligarMotor(sistemaCombustivel, sistemaEletrico);
        SistemaLuzes.ligar(sistemaEletrico);
        sistemaPneus.setPressao(sistemaPneus.getPressao()+2);
        combustivel.setNivel(combustivel.getNivel()-2);
        velocidade = 99;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public double getVelocidade() {
        return velocidade;
    }


    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }



    
    
}
