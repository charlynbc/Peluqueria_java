import java.util.HashMap;
import java.util.Map;
public class Manejador_clientes {
    private Map<String, Cliente> clientes= new HashMap<>();

    public void agregar_clientes(String nombre, String email){
        String key= email.toLowerCase();
        if(clientes.containsKey(key)){
            throw new IllegalArgumentException
        }


    }

}
