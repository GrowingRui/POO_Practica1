public class Emparejamiento {
    private Jugador jugador1;
    private Jugador jugador2;
    public Emparejamiento(Jugador jugador1, Jugador jugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public boolean estaJugador(String nombre){
        return this.jugador1.getNombre().equalsIgnoreCase(nombre)
                || this.jugador2.getNombre().equalsIgnoreCase(nombre);
    }

    public String toString() {
        return jugador1.getNombre() + " está emparejado con " +jugador2.getNombre();
    }
}
