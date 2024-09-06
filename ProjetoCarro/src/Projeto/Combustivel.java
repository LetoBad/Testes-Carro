package Projeto;

public class Combustivel {
	private String tipo;
	private double capacidade;
	private double nivel;
	private String marca;
	private boolean estado;

	public Combustivel(String tipo, double capacidade, double nivel, String marca, boolean estado) {
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.nivel = nivel;
		this.marca = marca;
		this.estado = estado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	public double getNivel() {
		return nivel;
	}

	public void setNivel(double nivel) {
		this.nivel = nivel;
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
	

    public void verificarNivel() {
        if (nivel <= 0) {
            System.out.println("O tanque está vazio.");
        } 
        else {
            System.out.println("O nível atual de combustível é: " + nivel + " litros.");
        }
    }

    
    public void abastecer(double quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade de combustível a ser abastecida deve ser positiva.");
        } else if (nivel + quantidade > capacidade) {
            System.out.println("Quantidade excede a capacidade do tanque. Só é possível abastecer " + (capacidade - nivel) + " litros.");
        } else {
            nivel += quantidade;
            System.out.println("O tanque foi abastecido com " + quantidade + " litros. Nível atual: " + nivel + " litros.");
        }
    }

   
    public void substituirTanque() {
        this.nivel = 0;
        System.out.println("O tanque de combustível foi substituído.");
    }
	

}
