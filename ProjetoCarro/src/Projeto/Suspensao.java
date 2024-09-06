package Projeto;

public class Suspensao {
	private String tipo;
	private String material;
	private double altura;
	private int rigidez;
	private String marca;
	private String estado;

	public Suspensao(String tipo, String material, double altura, int rigidez, String marca , String estado) {
		this.tipo = tipo;
		this.material = material;
		this.altura = altura;
		this.rigidez = rigidez;
		this.marca = marca;
		this.estado = estado;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getRigidez() {
		return rigidez;
	}

	public void setRigidez(int rigidez) {
		this.rigidez = rigidez;
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

	public void AjustarAltura(double novaAltura) {
		this.altura = novaAltura;
	}
	
	public void VerificaEstado() {
		System.out.println("O estado é" + estado);
	}
	
	
}
