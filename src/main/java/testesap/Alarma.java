package testesap;

public class Alarma {
    
    private boolean estado;
    private boolean sonando;

    public Alarma(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void LigarAlarma(SistemaEletrico sistemaEletrico , ChaveCarro chave){
        if(sistemaEletrico.getVoltagem()>=12 && chave.getCapacidadepila()>0 ){
            estado = true;
        }
    }

    public void DesligarAlarma(SistemaEletrico sistemaEletrico , ChaveCarro chave){
            if (chave.getCapacidadepila()>0) {
                estado = false;
                sonando = false;
            }    
    }

    /*public void sonarAlarma(SistemaEletrico sistemaEletrico , Portas sistemaPortas){
        if(sistemaEletrico.getEstado()== true && sistemaPortas.getEstado()== true){
            sonando = true;
            System.out.println("biiiiiiip biiiiiiip biiiiiiip kkkkk");
        }
    }*/

    public boolean isSonando() {
        return sonando;
    }

    public void setSonando(boolean sonando) {
        this.sonando = sonando;
    }




}


