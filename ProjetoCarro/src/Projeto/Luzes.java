package Projeto;

public class Luzes {
	private String tipo;
	private int intensidade;
	private String cor;
	private boolean estado;
	private String modelo;

	public Luzes(String tipo, int intensidade, String cor, boolean estado, String modelo) {
		this.tipo = tipo;
		this.intensidade = intensidade;
		this.cor = cor;
		this.estado = estado;
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIntensidade() {
		return intensidade;
	}

	public void setIntensidade(int intensidade) {
		this.intensidade = intensidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void ligar() {
		if (!estado) {
			estado = true;
			System.out.println("As luzes foram ligadas.");
		} else {
			System.out.println("As luzes já estão ligadas.");
		}
	}

	public void desligar() {
		if (estado) {
			estado = false;
			System.out.println("As luzes foram desligadas.");
		} else {
			System.out.println("As luzes já estão desligadas.");
		}
	}

	public void ajustarIntensidade(int novaintensidade) {
		if (novaintensidade >= 0 && novaintensidade <= 100) {
			this.intensidade = novaintensidade;
			System.out.println("A intensidade das luzes foi ajustada para: " + novaintensidade + "%.");
		} else {
			System.out.println("Intensidade inválida. Por favor, insira um valor entre 0 e 100.");
		}
	}

}
