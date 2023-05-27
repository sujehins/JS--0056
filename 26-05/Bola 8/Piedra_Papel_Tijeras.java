package juego;
import java.util.*;
public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner scanner = new Scanner(System.in);

	        System.out.println("¡Bienvenido al cachipun!");

	        while (true) {
	            System.out.println("\nJugador 1, elige: ");
	            System.out.println("1. Piedra");
	            System.out.println("2. Papel");
	            System.out.println("3. Tijera");
	            System.out.print("Ingrese su elección: ");
	            int jugador1 = scanner.nextInt();

	            System.out.println("\nJugador 2, elige: ");
	            System.out.println("1. Piedra");
	            System.out.println("2. Papel");
	            System.out.println("3. Tijera");
	            System.out.print("Ingrese su elección: ");
	            int jugador2 = scanner.nextInt();

	            System.out.println("\nResultados:");

	            if (jugador1 == jugador2) {
	                System.out.println("¡Es un empate!");
	            } else if ((jugador1 == 1 && jugador2 == 3) ||
	                    (jugador1 == 2 && jugador2 == 1) ||
	                    (jugador1 == 3 && jugador2 == 2)) {
	                System.out.println("¡Jugador 1 gana!");
	            } else {
	                System.out.println("¡Jugador 2 gana!");
	            }

	            System.out.println("\n¿Deseas seguir jugando? (s/n)");
	            String jugarDeNuevo = scanner.next();

	            if (!jugarDeNuevo.equalsIgnoreCase("s")) {
	                break;
	            }
	        }

	        System.out.println("\n¡Gracias por jugar!");

		
		
	}

}
