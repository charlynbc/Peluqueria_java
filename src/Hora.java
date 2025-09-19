public class Hora {
    private int hora;
    private int minuto;

    public Hora(int hora, int minuto){
        this.hora= hora;
        this.minuto= minuto;
    }

    public int get_hora(){return hora;}
    public int get_minutos(){return minuto;}

    public void set_hora(int hora){ this.hora=hora;}
    public void set_minutos(int minuto) { this.minuto = minuto; }


}
