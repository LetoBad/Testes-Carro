package testesap;

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


	public void OnOff(boolean  estado , SistemaEletrico sistemaEletrico){
		if(estado = true){
			ligar(sistemaEletrico);
		}
	}

	public void ligar(SistemaEletrico sistemaeletrico) {
        if(sistemaeletrico.getVoltagem()>=12){
            estado = true;
            System.out.println("Luzes ligadas!");
        }
        else{
            System.out.println("Nao foi possivel ligar");
        }
    }

	public void desligaLuzes(SistemaEletrico sistemaEletrico) {
        System.out.println("Luzes desligadas!");
        estado = false;
    }

	public void ajustarIntensidade(int novaintensidade) {
		if (estado = true && novaintensidade >= 0 && novaintensidade <= 100) {
			this.intensidade = novaintensidade;
			System.out.println("A intensidade das luzes foi ajustada para: " + novaintensidade + "%.");
		} else {
			System.out.println("Intensidade inválida. Por favor, insira um valor entre 0 e 100.");
		}
	}

}

