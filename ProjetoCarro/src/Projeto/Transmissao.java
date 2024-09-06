package Projeto;

public class Transmissao {
	private int marchaAtual;
	private String tipo;
	private int numeroMarchas;
	private String material;
	private String marca;
	private boolean estado;

	public Transmissao(int marchaAtual, String tipo, int numeroMarchas, String material, String marca, boolean estado) {
		this.marchaAtual = marchaAtual;
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

	public void aumentarMarcha() {
		if (marchaAtual < 6) {
			marchaAtual++;
			System.out.println("Marcha aumentada para " + marchaAtual);
		} else {
			System.out.println("Não é possível aumentar mais!");
		}
	}
}
