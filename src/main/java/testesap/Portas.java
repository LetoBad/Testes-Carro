package testesap;

public class Portas {
	private int quantidade;
	private String material;
	private String cor;
	private String tipo;
	private boolean estado;

	public Portas(int quantidade, String material, String cor, String tipo, boolean estado) {
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

	public boolean  getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
    public void abrir(Luzes sistemaLuzes, SistemaEletrico sistemaEletrico ){
		estado = true;
		sistemaLuzes.ligar(sistemaEletrico);
	}

	public void fechar(Luzes sistemaLuzes, SistemaEletrico sistemaEletrico){
		estado = false;
		sistemaLuzes.desligaLuzes(sistemaEletrico);
	}
    
    public String verificarEstado(){
        if(estado==true) {
            String FechadaAberta = "Porta aberta";
            return FechadaAberta;
        }
        else {
            String FechadaAberta = "Porta fechada";
            return FechadaAberta;

        }
    }
}
