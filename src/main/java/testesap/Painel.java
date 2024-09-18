package testesap;

public class Painel {
	private String tipo;
	private String display;
	private boolean controle;
	private String marca;
	private boolean estado;

	public Painel(String tipo, String display, boolean controle, String marca, boolean estado) {
		this.tipo = tipo;
		this.display = display;
		this.controle = controle;
		this.marca = marca;
		this.estado = estado;
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

	public String exibirStatus() {
		return "Motor ligado\nTransmissão ativa\nSistema elétrico funcionando\nPronto para acelerar o carro";
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

    
    public void atualizarInformacoes(String info) {
        if (estado) {
            System.out.println("Atualizando informações no painel: " + info);
        } else {
            System.out.println("O display está desligado. Ligue o display para atualizar as informações.");
        }
    }

    /*public String Painel(String string, Object object, boolean b, Object object2, boolean c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Painel'");
    }*/
}

