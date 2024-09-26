package testesap;

public class Painel {

	private String tipo;
	private String display;
	private boolean controle;
	private String marca;
	private boolean estado;
	private String pisca;
	private String info;

	public Painel(String tipo, String display, boolean controle, String marca, boolean estado , String pisca) {
		this.tipo = tipo;
		this.display = display;
		this.controle = controle;
		this.marca = marca;
		this.estado = estado;
		this.pisca = pisca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public boolean getControle() {
		return controle;
	}

	public void setControle(boolean controle) {
		this.controle = controle;
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


	public void ligarDisplay() {
        if (!estado) {
            estado = true;
            System.out.println("O display do painel foi ligado.");
        } else {
            System.out.println("O display do painel já está ligado.");
        }
    }

    
    public void desligarDisplay() {
        if (estado) { 
            estado = false;
            System.out.println("O display do painel foi desligado.");
        } else {
            System.out.println("O display do painel já está desligado.");
        }
    }


	public String getPisca() {
		return pisca;
	}

	public void setPisca(String pisca) {
		this.pisca = pisca;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}


	public void atualizarInformacoes(Motor motor, Combustivel sistemaCombustivel, Luzes luzes, Portas portas, Suspensao suspensao, Banco banco, SistemaEletrico sistemaeletrico, double velocidade) {
        if (sistemaeletrico.getEstado()) {
            info = "INFORMAÇÕES DO PAINEL:" + "\nPotência do Motor: " +
                    motor.getPotencia() + "CV" + "\n" +
                    portas.verificarEstado() + "\n" +
                    suspensao.VerificaEstado() + "\n" +
                    banco.getEstado() + "\n" +
                    "Nível de Combustivel: " + sistemaCombustivel.verificarNivel() + "L" + "\n" +
                    "Velocidade: " + velocidade + "Km";
        } else {
            System.out.println("Não foi possivel ligar o painel, há um problema no sistema elétrico.");
        }
    }


}

