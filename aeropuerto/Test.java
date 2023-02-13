package aeropuerto;

public class Test {
    public static void main(String[] args) {
        Pasajeros pasajero1 = new Pasajeros("lucas", "Flores", "34938765I", "lucasflores@gmail.com", "PZS3654789");
        Pasajeros pasajero2 = new Pasajeros("paco", "Gonzalez", "34938765I", "pacogonzalez@gmail.com", "PZP235467");
        Pilotos p1 = new Pilotos("Pepe", "Diaz Galvan", "32082095Q", "pepedg@gmail.com", "Alpha", true);
        Vuelos vuelo = new Vuelos("Sevilla", "Kiev", p1, 12);

        vuelo.asignarPasajeros(pasajero1);
        vuelo.asignarPasajeros(pasajero2);
        vuelo.mostrarPasajeros();

        System.out.println("El vuelo es de: " + vuelo.getCiudadOrigen() + " hasta: " + vuelo.getCiudadDestino() + " Y el piloto es: " + p1.getNombre());
    }
}
