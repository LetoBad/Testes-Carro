package testesap;

public class Motor {
	Combustivel combustible = new Combustivel("Gasolina", 70.0, 10, "x", true);
	SistemaEletrico sistemaeletrico = new SistemaEletrico(12, 90, "Litio", true, "Mora");
	static Motor motor = new Motor("V8", 510, 2.8, "Porsche", false);


	private String tipo;
	private int potencia;
	private double cilindrada;
	private String marca;
	private boolean estado;

	public Motor(String tipo, int potencia, double cilindrada, String marca, boolean estado) {
		this.tipo = tipo;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
		this.marca = marca;
		this.estado = estado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void ligarMotor() {
		if (motor.getEstado()== false && combustible.getNivel() > 0 && sistemaeletrico.getEstado()== true) {
			estado = true;
			System.out.println("motor ligado");
		}
		else{
			System.out.println("Nao foi possivel ligar o motor");
		}
	}
	public void desligarMotor() {
		if (estado == true) {
			estado = false;
			System.out.println("Motor Desligado");
		}
		else{
			System.out.println("o motor ja esta desligado");
		}
	}

	
}
