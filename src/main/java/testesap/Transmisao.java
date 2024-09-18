package testesap;

public class Transmisao {
        private int marchaAtual;
        private String tipo;
        private int numeroMarchas;
        private String material;
        private String marca;
        private boolean estado;
        carro Carro = new carro(true , Math.random()*20);
    
        public Transmisao(int marchaAtual, String tipo, int numeroMarchas, String material, String marca, boolean estado) {
            this.marchaAtual = marchaAtual;
            this.tipo = tipo;
            this.numeroMarchas = numeroMarchas;
            this.material = material;
            this.marca = marca;
            this.estado = estado;
        }
    
        public int getMarchaAtual() {
            return marchaAtual;
        }
    
        public void setMarchaAtual(int marchaAtual) {
            this.marchaAtual = marchaAtual;
        }
    
        public String getTipo() {
            return tipo;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
        public int getNumeroMarchas() {
            return numeroMarchas;
        }
    
        public void setNumeroMarchas(int numeroMarchas) {
            this.numeroMarchas = numeroMarchas;
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
    
        public boolean isEstado() {
            return estado;
        }
    
        public void setEstado(boolean estado) {
            this.estado = estado;
        }
    
        public void trocarMarcha(int marcha) {
            if (marcha >= 1 && marcha <= numeroMarchas) {
                this.marchaAtual = marcha;
                System.out.println("Marcha trocada para: " + marchaAtual);
            } else {
                System.out.println("Marcha inválida. O sistema suporta até " + numeroMarchas + " marchas.");
            }
        }
    
        public void verificarEstado() {
            if (estado) {
                System.out.println("Transmissão funcionando corretamente.");
            } else {
                System.out.println("Transmissão inativa ou com defeito.");
            }
        }
    
        public void substituirComponente(String componente) {
            System.out.println("Componente " + componente + " da transmissão substituído.");
        }

    
        public void subirMarcha(){
            if (marchaAtual <= numeroMarchas) {
                marchaAtual = marchaAtual + 1;
                System.out.println("Marcha atual: " + marchaAtual);
                Carro.setVelocidade( Carro.getVelocidade() + Math.random()*20);
                System.out.println("Velocidade atual : " + Carro.getVelocidade());
            }
            else{
                System.out.println("Não é possivel subir mais marchas");
            }
        }

        public void baixarMarcha(){
            if( marchaAtual >= 0 ){
                marchaAtual = marchaAtual - 1;
                System.out.println("Marcha atual: " + marchaAtual);
                Carro.setVelocidade( Carro.getVelocidade()/1.5);
                System.out.println("Velocidade atual : " + Carro.getVelocidade());
            }
            else{
                System.out.println("Não é possivel baixar mais marchas");
            }
        }
    
    }
    
