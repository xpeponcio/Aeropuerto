package aeropuerto;

public class Trabajadores extends personal{
    private double sueldo;  

    Trabajadores(String nombre, String apellido, String dni, String email, double sueldo){
        super(nombre, apellido, dni, email);
        this.sueldo = sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    public double getSueldo(){
        return this.sueldo;
    }
}
