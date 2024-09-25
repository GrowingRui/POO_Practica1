public class Jugador {
    private String nombre;
    private double puntuacion;

    public Jugador(String nombre){
        this.nombre = nombre;
        puntuacion = 0;
    }

    public Jugador(String nombre,double puntacion){
        this.nombre = nombre;
        this.puntuacion = puntacion;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public String toString() {
        return nombre;
    }

    public String toStringWithScore() {
        return nombre + " " + puntuacion;
    }
}
