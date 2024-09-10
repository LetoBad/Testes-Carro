package Projeto;

public class Portas {
	private int quantidade;
	private String material;
	private String cor;
	private String tipo;
	private String estado;

	public Portas(int quantidade, String material, String cor, String tipo, String estado) {
		this.quantidade = quantidade;
		this.material = material;
		this.cor = cor;
		this.tipo = tipo;
		this.estado = estado;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
    public void abrir() {
        if (!estado.equals("aberta")) {
            estado = "aberta";
            System.out.println("A porta foi aberta.");
        } else {
            System.out.println("A porta já está aberta.");
        }
    }

    
    public void fechar() {
        if (!estado.equals("fechada")) {
            estado = "fechada";
            System.out.println("A porta foi fechada.");
        } else {
            System.out.println("A porta já está fechada.");
        }
    }

    
    public void verificarEstado() {
        System.out.println("O estado atual das portas é: " + estado);
    }
}