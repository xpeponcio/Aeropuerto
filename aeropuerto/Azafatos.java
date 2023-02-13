package aeropuerto;

public class Azafatos extends personal{
    private double salario;
    private enum Idiomas{Inglés, Francés, Italiano, Español, Portuges};
    private Idiomas idioma;

    Azafatos(String nombre, String apellido, String dni, String email, double salario){
        super(nombre, apellido, dni, email);
        this.salario = salario;
    }

    public void setsalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setIdioma(String idioma){
        this.idioma = Idiomas.valueOf(idioma);
    }

    public Idiomas getIdioma(){
        return this.idioma;
    }
}
