package aeropuerto;

public class Pasajeros extends personal{
    private String numeroDePasaporte;

    Pasajeros(String nombre, String apellido, String dni, String email, String numeroPasaporte){
        super(nombre, apellido, dni, email);
        this.numeroDePasaporte = numeroPasaporte;
    }

    public void setNumeroPasaporte(String numeroPasaporte){
        this.numeroDePasaporte = numeroPasaporte;
    }

    public String getNumeroPasaporte(){
        return this.numeroDePasaporte;
    }
}
