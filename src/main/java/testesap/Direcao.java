package testesap;

public class Direcao {
	private String tipo;
	private boolean assistido;
	private String material;
	private double relacion;
	private String marca;

	public Direcao(String tipo, boolean assistido, String material, double relacion, String marca) {
		this.tipo = tipo;
		this.assistido = assistido;
		this.material = material;
		this.relacion = relacion;
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean getAssistido() {
		return assistido;
	}

	public void setAssistido(boolean assistido) {
		this.assistido = assistido;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getRelacion() {
		return relacion;
	}

	public void setRelacion(double relacion) {
		this.relacion = relacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void ajustarDirecao(double angulo) {
		if (angulo >= -180 && angulo <= 180) {
			System.out.println("O ângulo da direção foi ajustado para: " + angulo + " graus.");
		} else {
			System.out.println("Ângulo inválido. Insira um valor entre -180 e 180 graus.");
		}
	}

	public void verificarEstado() {
		if (assistido) {
			System.out.println("O sistema de direção está funcionando corretamente com assistência.");
		} else {
			System.out.println("O sistema de direção está funcionando, mas sem assistência.");
		}
	}

	public void substituirComponente(String componente) {
		System.out.println("O componente " + componente + " foi substituído no sistema de direção.");
	}

}
