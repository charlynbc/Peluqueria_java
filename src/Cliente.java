public class Cliente{

    private String email;
    private String nombre;
    private int edad;

    public Cliente(String email, String nombre, int edad){
        this.email= email;
        this.nombre= nombre;
        this.edad= edad;
    }
    //Getters para leer los valores
    public String get_nombre(){
        return nombre;
    } 
    public String get_email(){
        return email;
    }
    public int get_edad(){
        return edad;
    }
    //setters
    public void set_nombre(String nombre){ this.nombre= nombre;}
    public void set_edad(int edad){this.edad= edad}

}