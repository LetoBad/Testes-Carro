package testesap;

public class Freios {
	private String tipo;
	private String material;
	private String marca;
	private double tamanho;
	private double desgaste;

	public Freios(String tipo, String material, String marca, double tamanho, double desgaste) {
		this.tipo = tipo;
		this.material = material;
		this.marca = marca;
		this.tamanho = tamanho;
		this.desgaste = desgaste;
	}

	public double verificarDesgaste() {
        return desgaste;

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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getDesgaste() {
		return desgaste;
	}

	public void setDesgaste(double desgaste) {
		this.desgaste = desgaste;
	}

	public void SubstituirFreios(String tipo, String material, String marca, double tamanho,  double desgaste) {
        this.tipo = tipo;
        this.material = material;
		this.marca = marca;
		this.tamanho = tamanho;
        this.desgaste = desgaste;
    }

	public void substituirPastilhas(){
        desgaste = (Math.random() * 90 );
        if (desgaste<75){
            System.out.println("Pastilha em bom estado ainda.");
        }
        else {
            System.out.println("Pastilha substituida!");
        }
    }

	public void ajustarFreio(double Ajuste){
        if(Ajuste<=10){
            System.out.println("Freio ajustado");
        }
        else {
            System.out.println("Freio funcionando Bem");
        }
    }
}