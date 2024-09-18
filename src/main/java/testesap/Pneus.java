package testesap;

public class Pneus {
	private String tamanho;
	private String tipo;
	private double pressao;
	private String marca;
	private String estado;

	public Pneus(String tamanho, String tipo, double pressao, String marca, String estado) {
		this.tamanho = tamanho;
		this.tipo = tipo;
		this.pressao = pressao;
		this.marca = marca;
		this.estado = estado;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPressao() {
		return pressao;
	}

	public void setPressao(double pressao) {
		this.pressao = pressao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void verificarPressao() {
		System.out.println("A pressão atual dos pneus é: " + pressao + " PSI.");
	}

	public void ajustarPressao(double novaPressao) {
		if (novaPressao > 0 && novaPressao <= 50) {
			pressao = novaPressao;
			System.out.println("A pressão dos pneus foi ajustada para: " + novaPressao + " PSI.");
		} else {
			System.out.println("Pressão inválida. Insira um valor entre 1 e 50 PSI.");
		}
	}

	public void substituir() {
		estado = "novo";
		System.out.println("O pneu foi substituído. Estado atual: " + estado);
	}

}
