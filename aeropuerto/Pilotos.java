package aeropuerto;

public class Pilotos extends personal{
    enum Rango{Alpha, Tango, Águila};
    private Rango rango;
    private boolean vuelosInternacionales;

    public Pilotos(String nombre, String apellido, String dni, String email, String rango, boolean vuelosInternacionales){
        super(nombre, apellido, dni, email);
        this.rango = Rango.valueOf(rango);
        this.vuelosInternacionales = vuelosInternacionales;
    }

    public void setRango(String rango){
        this.rango = Rango.valueOf(rango);
    }

    public Rango getRango(){
        return this.rango;
    }

    public void setVuelosInternacionales(boolean vuelosInternacionales){
        this.vuelosInternacionales = vuelosInternacionales;
    }

    public boolean getVuelosInternacionales(){
        return this.vuelosInternacionales;
    }
}
