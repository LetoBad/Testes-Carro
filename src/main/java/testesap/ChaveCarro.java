package testesap;

public class ChaveCarro {
    private double Capacidadepila;

    public double getCapacidadepila() {
        return Capacidadepila;
    }

    public void setCapacidadepila(double capacidadepila) {
        Capacidadepila = capacidadepila;
    }

    public ChaveCarro(double capacidadepila) {
        Capacidadepila = capacidadepila;
    }

    public void ControleLigaAlarma( SistemaEletrico sistemaEletrico,Alarma sisteAlarma){
        sisteAlarma.LigarAlarma(sistemaEletrico, this);
    }

    public void ControleDesligaAlarma( SistemaEletrico sistemaEletrico,Alarma sisteAlarma){
        sisteAlarma.DesligarAlarma(sistemaEletrico, this);
    }

}
