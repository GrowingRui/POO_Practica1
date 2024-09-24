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

    /*
    public void altaJugador(Scanner sc){
        System.out.print("Introduce el nombre del jugador: ");
        String nombre = sc.next();
        if (!listaJugadores.jugadorExistente(nombre)){
            Jugador nuevo = new Jugador(nombre);
            listaJugadores.insertarJugador(nuevo);
            System.out.println("Jugador creado correctamente.");
        }else {
            System.out.println("Jugador con este nombre ya existe.");
            System.out.println("No se puede crear jugadores existentes");
        }
    }
     */

    /*
    public void bajaJugador(Scanner sc){
        System.out.print("Introduce el nombre del jugador que quiere darse de baja: ");
        String nombre = sc.next();
        if (listaJugadores.jugadorExistente(nombre)){
            listaJugadores.eliminarJugador(nombre);
            System.out.println("Jugador borrado correctamente");
        }
    }
     */

    public String toString() {
        return nombre;
    }

    public String toStringWithScore() {
        return nombre + " " + puntacion;
    }
}
