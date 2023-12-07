package app.Logic.AutenticacionCRUD;

import java.io.Serializable;
import java.util.UUID;

public class Cliente implements Serializable{
    private UUID id;
    private String Nombre;
    private String Email;
    private String Password;
    

    public Cliente(String Nombre, String Email, String Password){
        this.id = UUID.randomUUID();
        this.Nombre = Nombre;
        this.Email = Email;
        this.Password = Password;
    }

    public String to_String(){
        return "{" + id + "} {" + Nombre + "} {" + Email + "} {" + Password + "}";
    }
}
