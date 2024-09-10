package Projeto;

public class SistemaEletrico {
	private double voltagem;
	private double capacidade;
	private String tipoBateria;
	private boolean estado;
	private String marca;

	public SistemaEletrico(double voltagem, double capacidade, String tipoBateria, boolean estado, String marca) {
		this.voltagem = voltagem;
		this.capacidade = capacidade;
		this.tipoBateria = tipoBateria;
		this.estado = estado;
		this.marca = marca;
	}

	public double getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(double voltagem) {
		this.voltagem = voltagem;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	public String getTipoBateria() {
		return tipoBateria;
	}

	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void ativarParteEletrica() {
		System.out.println("Sistema eletrico ativado.");
	}
	
    public void verificarBateria() {
        if (capacidade > 20) {
            System.out.println("Bateria em bom estado. Capacidade restante: " + capacidade + "%.");
        } else {
            System.out.println("Bateria fraca. Capacidade restante: " + capacidade + "%. Recarregue ou substitua a bateria.");
        }
    }

    
    public void substituirBateria() {
        tipoBateria = "nova";
        capacidade = 100;
        System.out.println("Bateria substituída. Capacidade atual: " + capacidade + "%.");
    }

  
    public void testarSistema() {
        if (estado) {
            System.out.println("Sistema elétrico está funcionando corretamente.");
        } else {
            System.out.println("Sistema elétrico está desligado. Ligue para testar.");
        }
    }
}
