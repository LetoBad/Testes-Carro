package testesap;

public class Banco {
    private int quantidade;
    private String material;
    private String cor;
    private String tipo;
    private String estado;
    private double altura;
    private double temperatura;

    public Banco(int quantidade, String material, String cor, String tipo, String estado, double altura) {
        this.quantidade = quantidade;
        this.material = material;
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
        this.altura = altura;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(double var) {

        if (var < 2.5) {
            estado = "O banco está inclinado 90º";
        }
        if (var > 2.5 && 5 > var) {
            estado = "O banco está inclinado 75º";
        }
        if (var > 5 && 7.5 > var) {
            estado = "O banco está inclinado 50º";
        }
        if (var > 7.5 && 10 > var) {
            estado = "O banco está inclinado 35º";
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void ajustarEncosto(String posicao) {
        if (posicao.equalsIgnoreCase("reto") || posicao.equalsIgnoreCase("inclinada")) {
            System.out.println("O encosto foi ajustado para a posição: " + posicao);
        } else {
            System.out.println("Posição inválida. Escolha entre 'reto' ou 'inclinada'.");
        }
    }

    public double ajustarAltura(double novaAltura) {
        if (novaAltura >= 0 && novaAltura <= 2) {
            System.out.println("A altura do banco foi ajustada para: " + novaAltura + " metros.");
            altura = novaAltura;
            return novaAltura;
        } else {
            System.out.println("Altura inválida. Insira um valor entre 0 e 2 .");
            return novaAltura;
        }
    }

    public void verificarEstado() {
        System.out.println("O estado atual dos bancos é: " + estado);
    }

    public void esquentarbanco(SistemaEletrico sistemaEletrico, double temp) {
        if (sistemaEletrico.getVoltagem() >= 12) {
            double temper = temp;
            setTemperatura(temper);
        }
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

}