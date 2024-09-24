import java.util.Scanner;

public class Test {
    public static int menu(Scanner sc){
        System.out.println("> create [player]");
        System.out.println("> remove [player]");
        System.out.println("> show");
        System.out.println("> rank");
        System.out.println("> score [player];[score]");
        System.out.println("> show_matchmake");
        System.out.println("> clear_matchmake");
        System.out.println("> matchmake [player1];[player2]");
        return leerNumero(sc);
    }

    public static int leerNumero(Scanner sc){
        int x;
        do {
            System.out.print("Choose an option: ");
            x = sc.nextInt();
        }while (x < 1 || x > 8);
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEmparejamiento listaEmparejamiento = new ListaEmparejamiento(10);
        Jugador j1 = new Jugador("Luisa",4.5);
        Jugador j2 = new Jugador("Manuel",2.7);
        Jugador j3 = new Jugador("Kurt",4);
        Jugador j4 = new Jugador("Sofia",3.8);
        Jugador j5 = new Jugador("Robert",3.8);
        ListaJugadores listaJugadores = new ListaJugadores();
        listaJugadores.insertarJugador(j1);
        listaJugadores.insertarJugador(j2);
        listaJugadores.insertarJugador(j3);
        listaJugadores.insertarJugador(j4);
        listaJugadores.insertarJugador(j5);
        int x;
        do {
            x = leerNumero(sc);
            switch (x){
                case 1:
                    listaJugadores.altaJugador(sc);
                    break;
                case 2:
                    listaJugadores.bajaJugador(sc);
                    break;
                case 3:
                    listaJugadores.mostrarJugadores();
                    break;
                case 4:
                    listaJugadores.rankerJugadores();
                    break;
                case 5:
                    System.out.print("Cuál de los jugadores quieres ver?");
                    String name = sc.next();
                    System.out.println(listaJugadores.getJugador(listaJugadores.buscarPosicion(name)).toStringWithScore());
                    break;
                case 6:
                    listaEmparejamiento.mostrarEmparejamientos();
                    break;
                case 7:
                    listaEmparejamiento.borrarEmparejamiento();
                    break;
                case 8:
                    listaEmparejamiento.crearEmparejamiento(sc);
            }
        }while (x != 0);




    }
}
