package Projeto;

public class Freios {
	private String tipo;
	private String material;
	private String marca;
	private double tamanho;
	private double desgaste;

	public Freios(String tipo, String material, String marca, double tamanho, double desgaste) {
		this.tipo = tipo;
		this.material = material;
		this.marca = marca;
		this.tamanho = tamanho;
		this.desgaste = desgaste;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getDesgaste() {
		return desgaste;
	}

	public void setDesgaste(double desgaste) {
		this.desgaste = desgaste;
	}

	public String verificarDesgaste() {
		if (desgaste >= 75) {
			return "Desgaste alto, substituição recomendada.";
		} else if (desgaste >= 50) {
			return "Desgaste médio, monitore o desgaste regularmente.";
		} else {
			return "Desgaste baixo, os freios estão em bom estado.";
		}
	}

	public void substituirPastilhas() {
		this.desgaste = 0;
		System.out.println("As pastilhas de freio foram substituídas.");
	}

	public void ajustarFreio() {
		System.out.println("O sistema de freio foi ajustado corretamente.");
	}

}
