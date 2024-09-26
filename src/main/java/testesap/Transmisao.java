package testesap;

public class Transmisao {
        private String tipo;
        private int numeroMarchas;
        private String material;
        private String marca;
        private boolean estado;
    
        public Transmisao(String tipo, int numeroMarchas, String material, String marca, boolean estado) {
            this.tipo = tipo;
            this.numeroMarchas = numeroMarchas;
            this.material = material;
            this.marca = marca;
            this.estado = estado;
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
        
        public void verificarEstado(){
            if(estado == true){
                System.out.println("A transmissão está funcionando");
            }
            else{
                System.out.println("A transmissão não está funcionando");
            }
        }


        public void trocarMarcha(int marcha, Motor motor){
            if(motor.verificarEstado() == true){
                System.out.println("A marcha atual: " + marcha);
            }
            else{
                System.out.println("O carro não está ligado.");
            }
        }

        public void substituir(String tipo, int numeroMarchas, String material, String marca, boolean estado) {
            this.tipo = tipo;
            this.numeroMarchas = numeroMarchas;
            this.material = material;
            this.marca = marca;
            this.estado = estado;
        }
    
    }
    
