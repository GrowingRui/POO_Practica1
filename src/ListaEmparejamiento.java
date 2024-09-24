import java.util.Scanner;

public class ListaEmparejamiento {
    private Emparejamiento emparejamiento;
    private Emparejamiento[] emparejamientos;
    private int numEmparejamiento;
    private ListaJugadores listaJugadores;

    public ListaEmparejamiento(int capacidad){
        emparejamientos = new Emparejamiento[capacidad];
        numEmparejamiento = 0;
    }

    public boolean estaEmparejando(String nombre){
        boolean state = false;
        for (int i = 0; i < numEmparejamiento; i++){
            if (emparejamientos[i].estaJugador(nombre)){
                state = true;
            }
        }
        return state;
    }

    public void insertarEmparejamiento(Jugador jugador1, Jugador jugador2){
        this.emparejamientos[numEmparejamiento] = new Emparejamiento(jugador1,jugador2);
        numEmparejamiento++;
    }

    public void borrarEmparejamiento(){
        this.emparejamientos = null;
        numEmparejamiento = 0;
    }

    public void crearEmparejamiento(Scanner sc){
        System.out.print("Introduce el nombre del jugador 1: ");
        String nombre1 = sc.next();
        if (!estaEmparejando(nombre1)){
            Jugador jugador1 = new Jugador(nombre1);
            System.out.print("Introduce el nombre del jugador 2: ");
            String nombre2 = sc.next();
            if (!estaEmparejando(nombre2)){
                Jugador jugador2 = new Jugador(nombre2);
                insertarEmparejamiento(jugador1,jugador2);
            }else {
                System.out.println("Este jugador ya está emparejando");
            }
        }else {
            System.out.println("Este jugador ya está emparejando");
        }
    }

    public void emparejadoAleatorio(){
        ListaJugadores aux = this.listaJugadores;
        int size = aux.getNumJugadores();
        if (size % 2 == 0){
            while (size >= 0){
                int position1 = (int) (Math.random() * size);
                int position2 = (int) (Math.random() * size);
                if (position1 != position2){
                    Jugador a = aux.getJugador(position1);
                    Jugador b = aux.getJugador(position2);
                    emparejamiento = new Emparejamiento(a,b);
                    aux.eliminarJugador(a.getNombre());
                    aux.eliminarJugador(b.getNombre());
                    size = size - 2;
                }
            }
        }
    }

    public void mostrarEmparejamientos(){
        for (int i = 0; i < numEmparejamiento; i++){
            System.out.println("> " + emparejamientos[i].toString());
        }
    }
}
