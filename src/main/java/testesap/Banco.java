package testesap;

public class Banco {
    private int quantidade;
    private String material;
    private String cor;
    private String tipo;
    private String estado;
    private double altura;
    public Banco(int quantidade, String material, String cor, String tipo, String estado) {
        this.quantidade = quantidade;
        this.material = material;
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
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

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

    public void ajustarEncosto(String posicao) {
        if (posicao.equalsIgnoreCase("reto") || posicao.equalsIgnoreCase("inclinada")) {
            System.out.println("O encosto foi ajustado para a posição: " + posicao);
        } else {
            System.out.println("Posição inválida. Escolha entre 'reto' ou 'inclinada'.");
        }
    }

    public void ajustarAltura(double novaAltura) {
        if (novaAltura >= 0 && novaAltura <= 2) {
            System.out.println("A altura do banco foi ajustada para: " + novaAltura + " metros.");
            altura = novaAltura;
        } else {
            System.out.println("Altura inválida. Insira um valor entre 0 e 2 .");
        }
    }

    public void verificarEstado() {
        System.out.println("O estado atual dos bancos é: " + estado);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}