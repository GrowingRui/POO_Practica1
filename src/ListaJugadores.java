import java.util.*;

public class ListaJugadores {
    public Jugador[] jugadores;
    private int numJugadores;
    private final static int MAX_JUGADORES = 20;

    public ListaJugadores(){
        numJugadores = 0;
        jugadores = new Jugador[MAX_JUGADORES];
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public Jugador getJugador(int posicion){
        return jugadores[posicion];
    }

    public int buscarPosicion(String nombre){
        int posicion = -1;
        for (int i = 0; i < numJugadores && posicion == -1; i++){
            if (jugadores[i].getNombre().equalsIgnoreCase(nombre)){
                posicion = i;
            }
        }
        return posicion;
    }

    public boolean jugadorExistente(String nombre){
        return this.buscarPosicion(nombre) != -1;
    }

    public void insertarJugador(Jugador jugador){
        jugadores[numJugadores] = jugador;
        numJugadores++;
    }

    public void eliminarJugador(String nombre){
        int posicion = this.buscarPosicion(nombre);
        for (int i = posicion+1; i < numJugadores; i++){
            jugadores[i-1] = jugadores[i];
        }
        jugadores[numJugadores-1] = null;
        numJugadores--;
    }

    public void altaJugador(Scanner sc){
        System.out.print("Introduce el nombre del jugador: ");
        String nombre = sc.next();
        if (!jugadorExistente(nombre)){
            Jugador nuevo = new Jugador(nombre);
            insertarJugador(nuevo);
            System.out.println("Jugador creado correctamente.");
        }else {
            System.out.println("Jugador con este nombre ya existe.");
            System.out.println("No se puede crear jugadores existentes");
        }
    }

    public void bajaJugador(Scanner sc){
        System.out.print("Introduce el nombre del jugador que quiere darse de baja: ");
        String nombre = sc.next();
        if (jugadorExistente(nombre)){
            eliminarJugador(nombre);
            System.out.println("Jugador borrado correctamente");
        }
    }

    public void mostrarJugadores(){
        for (int i = 0; i < numJugadores; i++){
            System.out.println(i+1 + ". " + jugadores[i].toString());
        }
    }

    public void rankerJugadores(){
        ListaJugadores aux = this;
        int size = aux.getNumJugadores();
        final int LEN = aux.getNumJugadores();
        for (int i = 0; i < LEN; i++){
            double puntoMax = 0;
            int position = 0;
            for (int j = 0; j < size; j++){
                if (puntoMax < aux.getJugador(j).getPuntuacion()){
                    puntoMax = aux.getJugador(j).getPuntuacion();
                    position = j;
                }
            }
            System.out.println(aux.getJugador(position).toStringWithScore());
            aux.eliminarJugador(aux.getJugador(position).getNombre());
            size--;
        }
    }
}
