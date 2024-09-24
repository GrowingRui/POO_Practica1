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

    /*
    public void crearEmparejamiento(Scanner sc){
        System.out.print("Introduce el nombre del jugador 1: ");
        String nombre1 = sc.next();
        if (!listaEmparejamiento.estaEmparejando(nombre1)){
            jugador1 = new Jugador(nombre1);
            System.out.print("Introduce el nombre del jugador 2: ");
            String nombre2 = sc.next();
            if (!listaEmparejamiento.estaEmparejando(nombre2)){
                jugador2 = new Jugador(nombre2);
                listaEmparejamiento.insertarEmparejamiento(jugador1,jugador2);
            }else {
                System.out.println("Este jugador ya está emparejando");
            }
        }else {
            System.out.println("Este jugador ya está emparejando");
        }
    }

     */

    public String toString() {
        return jugador1.getNombre() + " está emparejado con " +jugador2.getNombre();
    }
}
