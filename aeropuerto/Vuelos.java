package aeropuerto;

import java.util.ArrayList;

public class Vuelos {
    private String ciudadOrigen;
    private String ciudadDestino;
    private Pilotos piloto;
    private ArrayList<Pasajeros> pasajeros;
    private int duracion;

    Vuelos(String ciudadOrigen, String ciudadDestino, Pilotos piloto, int duracion){
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.piloto = piloto;
        this.duracion = duracion;
        this.pasajeros = new ArrayList<>();
    }

    public void setCiudadOrigen(String ciudadOrigen){
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadOrigen(){
        return this.ciudadOrigen;
    }

    public void setCiudadDestino(String ciudadDestino){
        this.ciudadDestino = ciudadDestino;
    }

    public String getCiudadDestino(){
        return this.ciudadDestino;
    }

    public void setpiloto(Pilotos piloto){
        this.piloto = piloto;
    }

    public Pilotos getPiloto(){
        return this.piloto;
    }

    public void setListaPasajeros(ArrayList<Pasajeros> pasajero){
        this.pasajeros = pasajero;
    }

    public ArrayList<Pasajeros> getListaPasajeros(){
        return this.pasajeros;
    }

    public void setDuracion(int duracion){
        this.duracion = duracion;
    }

    public int getNombre(){
        return this.duracion;
    }

    public void asignarPasajeros(Pasajeros p){
        this.pasajeros.add(p);
    }

    public void mostrarPasajeros(){
        for(Pasajeros p : pasajeros){
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Numero de Pasaporte: " + p.getNumeroPasaporte());
        }
    }
}
