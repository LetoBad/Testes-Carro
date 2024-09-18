package testesap;

public class carro {
    private boolean estado;
    private double velocidade = 0;
    Combustivel combustible = new Combustivel("Gasolina", 70.0, 10, "x", true);
    Painel painel = new Painel("Digital", "Normal", true, "Porsche", true);
    Portas porta = new Portas(2, "Fibra", "Vermelho", "Normal", "Fechada");
    SistemaEletrico sistemaeletrico = new SistemaEletrico(12, 90, "Litio", true, "Mora");
    Motor motor = new Motor("V8", 510, 2.8, "Porsche", true);
    static Banco bancos = new Banco(2, "Coro", "Preto", "Competicao", "Otimo");
    static Transmisao trans = new Transmisao(1, "Manual", 6, "Aluminio", "Porsche", true);
    static Freios freios = new Freios("Pastilha", "Fibra", "Pirelli", 10.0, 20);
    Direcao direcao = new Direcao("Assistida", true, "Carbono", 2.7, "Momo", 0);
    Luzes luzes = new Luzes("Farol", 10, "Branca", false, "LED");

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public carro(boolean estado, double velocidade) {
        this.estado = estado;
        this.velocidade = velocidade;
    }

    public void acelerar() {
        if (estado == true && trans.getMarchaAtual() > 0) {
            System.out.println("O carro comecou a acelerar");
            velocidade = Math.random() * 10;
            System.out.println("Velocidade : " + velocidade);
        } else {
            System.out.println("O carro esta em neutro ou desligado");
        }
    }

    public void freiar() {
        if (estado = true && velocidade > 0) {
            System.out.println("O carro comecou a freiar");
            velocidade = velocidade / 2;
            System.out.println("Velocidade : " + velocidade);
            velocidade = velocidade / 2;
            System.out.println("Velocidade : " + velocidade);
            velocidade = velocidade / 2;
            System.out.println("Velocidade : " + velocidade);
            velocidade = 0;
            System.out.println("Velocidade : " + velocidade);
            freios.setDesgaste(freios.getDesgaste() + 1);
            System.out.println("Desgaste dos freios :" + freios.getDesgaste());
        } else {
            System.out.println("O carro esta em neutro ou desligado");
        }
    }

    public void LigaCarro() {
        if (combustible.getNivel() > 0 && porta.getEstado() == "Fechada" && sistemaeletrico.getEstado() == true
                && motor.getEstado() == true) {
            System.out.println("O carro ligou");
            estado = true;
        } else {
            System.out.println("O Carro nao ligou");
        }

    }

    public void DesligarCarro() {
        if (estado == true) {
            System.out.println("Carro desligado");
            estado = false;
        } else {
            System.out.println("O Carro ja esta desligado");
        }

    }

    public void virar(double angulo) {
        direcao.ajustarDirecao(angulo);
        if (angulo > 0) {
            System.out.println("O carro esta virando a direita");
        } else {
            System.out.println("O carro esta virando a izquierda");
        }
    }

    public void ligarLuzes() {
        if (luzes.isEstado() == false) {
            luzes.setEstado(true);
            System.out.println("Luzes Ligadas");
        }else{
            System.out.println("A luz ja esta desligada");
        }
    }
    public void desligarLuzes() {
        if (luzes.isEstado() == true) {
            luzes.setEstado(false);
            System.out.println("Luzes Desligadas");
        }
    }



    public static void main(String[] args) {
        bancos.ajustarAltura(1.1);
        carro Carro = new carro(true, 0);
        Carro.LigaCarro();
        Carro.ligarLuzes();
        Carro.acelerar();
        trans.subirMarcha();
        trans.subirMarcha();
        trans.subirMarcha();
        Carro.virar(-10);
        trans.baixarMarcha();
        trans.baixarMarcha();
        trans.baixarMarcha();
        trans.baixarMarcha();
        Carro.freiar();
        Carro.desligarLuzes();
        Carro.DesligarCarro();
        freios.getDesgaste();
        
    }
}
