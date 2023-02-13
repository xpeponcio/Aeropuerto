package aeropuerto;

public class personal {
    private String nombre;
    private String apellidos;
    private String dni;
    private String mail;

    personal(String nombre, String apellidos, String dni, String email){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.mail = email;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public String getDni(){
        return this.dni;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public String getMail(){
        return this.mail;
    }


}
