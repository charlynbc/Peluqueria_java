public class Reserva{
    private String servicio;
    private Fecha fecha;

    public Reserva(String servicio, Fecha fecha){
        this.servicio= servicio;
        this.fecha= fecha;
    }

    // Getters
    public Fecha get_fecha(){ return fecha;}
    public String get_servicio(){ return servicio;}

    // setters
    public void set_fecha(Fecha nueva_fecha){
        this.fecha= nueva_fecha;
    }

    public void set_servicio(String nuevo_servicio){
        this.servicio= nuevo_servicio;
    }
    
}