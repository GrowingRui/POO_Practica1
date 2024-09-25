public class Jugador {
    private String nombre;
    private double puntacion;
    public Jugador(String nombre){
        this.nombre = nombre;
        puntacion = 0;
    }
    public Jugador(String nombre,double puntacion){
        this.nombre = nombre;
        this.puntacion = puntacion;
    }

    public double getPuntacion() {
        return puntacion;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String toString() {
        return nombre;
    }

    public String toStringWithScore() {
        return nombre + " " + puntacion;
    }
}
