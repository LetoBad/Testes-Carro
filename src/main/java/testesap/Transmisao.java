package testesap;

public class Transmisao {
    private String tipo;
    private int numeroMarchas;
    private String material;
    private String marca;
    private boolean estado;
    private int marchaAtual;

    public Transmisao(String tipo, int numeroMarchas, String material, String marca, boolean estado, int marchaAtual) {
        this.tipo = tipo;
        this.numeroMarchas = numeroMarchas;
        this.material = material;
        this.marca = marca;
        this.estado = estado;
        this.marchaAtual = marchaAtual;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void verificarEstado() {
        if (estado) {
            System.out.println("A transmissão está funcionando");
        } else {
            System.out.println("A transmissão não está funcionando");
        }
    }

    public void trocarMarcha(int marcha, Motor motor) {
        if (!motor.verificarEstado()) {
            System.out.println("O carro não está ligado.");
            return;
        }

        if (marcha < 1 || marcha > numeroMarchas) {
            System.out.println("Marcha inválida. O número deve estar entre 1 e " + numeroMarchas);
            return;
        }

        if (marchaAtual != marcha) {
            System.out.println("Trocando para a marcha: " + marcha);
            this.marchaAtual = marcha;
        } else {
            System.out.println("Já está na marcha: " + marchaAtual);
        }
    }

    public void substituir(String tipo, int numeroMarchas, String material, String marca, boolean estado) {
        this.tipo = tipo;
        this.numeroMarchas = numeroMarchas;
        this.material = material;
        this.marca = marca;
        this.estado = estado;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }
}
