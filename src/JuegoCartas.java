import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Random;
import java.util.Scanner;

public class JuegoCartas {

    public static void main(String[] args) {
        ejecutarMenu();
    }

    static public String[][] crearMartizCartas(){
        String[][] matrizCartas = new String[12][2];
        return matrizCartas;
    }

    static public void agregarCartasJuego(String nombreCarta, String puntaje) {
       String[][] martizCartas = crearMartizCartas();
        for (int i = 0; i < 12; i++) {
                if (martizCartas[i][0] == null){
                    martizCartas[i][0] = nombreCarta;
                    martizCartas[i][1] = puntaje;
            }
        }
    }

    static public void inicializarCartasJuego(){

        agregarCartasJuego("As","11");
        agregarCartasJuego("Trebol","2");
        agregarCartasJuego("Diamante", "3");
        agregarCartasJuego("Pica","4");
        agregarCartasJuego("Corazones","5");
        agregarCartasJuego("Trebol","6");
        agregarCartasJuego("Diamante","7");
        agregarCartasJuego("Pica","8");
        agregarCartasJuego("Corazones","9");
        agregarCartasJuego("Jota","10");
        agregarCartasJuego("Quina","10");
        agregarCartasJuego("Kaiser","10");

    }

    static public String obtenerCartas(){
        inicializarCartasJuego();
        String[][] martizCartas = crearMartizCartas();
        Random random = new Random();
        for (int i = 0; i < 12; i++) {

        }
    }

    static public void jugar(){



    }

    public static void ejecutarMenu(){
        int opcion;
        do{
            inicializarCartasJuego();
            mostrarMenu();
            opcion = leerOpcion();
            ejecutarOpcion(opcion);
        }while (opcion != 2);
    }

    public static void mostrarMenu(){
        System.out.println("Menu de juego");
        System.out.println("1. Agregar vinilos");
        System.out.println("2. salir");
    }

    public static int leerOpcion() {
        int opcion = 0;
        while (true) {
            Scanner scanner = crearScanner();
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= 2) {
                    break;
                } else {
                    System.out.print("Opción inválida. Intente nuevamente: ");
                }
            } else {
                System.out.print("Entrada no válida. Ingrese un número: ");
                scanner.next();
            }
        }

        return opcion;
    }

    public static Scanner crearScanner(){
        return new Scanner(System.in);
    }

    public static void ejecutarOpcion(int opcion){
        opcion = leerOpcion();
        switch (opcion){
            case 1:
                jugar();
                break;
            case 2:
                System.out.println("cerrando programa");
                break;
        }
    }


}
