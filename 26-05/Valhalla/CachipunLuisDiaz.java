package ejemplos;

import java.util.Scanner;

public class CachipunLuisDiaz {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static int validarNumero(String frase) {
		int opcion = 0;
		
		do {
			
			System.out.println(frase);
			System.out.println("1-tijera\n" + "2-papel\n" + "3-piedra\n");
			opcion = scanner.nextInt();
			
		}while(opcion <= 0 || opcion > 3); 
		
		return opcion;
	}
	public static void main(String[] args) {
	
		// 1 sera tijera 2 sera papel 3 sera piedra
		
		int opcionJugador1 = 0, opcionJugador2 = 0;
		
		opcionJugador1 = validarNumero("jugador 1 ingrese una opcion valida");
		opcionJugador2 = validarNumero("jugador 2 ingrese una opcion valida");
		
		switch(opcionJugador1) {
		case 1:
			if(opcionJugador2 == 1) {
				System.out.println("ustedes han empatado");
			} else if(opcionJugador2 == 2) {
				System.out.println("ha ganado el jugador 1");
			} else {
				System.out.println("ha ganado el jugador 2");
			}
			break;
		case 2:
			if(opcionJugador2 == 1) {
				System.out.println("jugador 2 ha ganado");
			} else if(opcionJugador2 == 2) {
				System.out.println("ustedes han empatado");
			} else {
				System.out.println("ha ganado el jugador 1");
			}
			break;
		case 3:
			if(opcionJugador2 == 1) {
				System.out.println("ha ganado jugador 1");
			} else if(opcionJugador2 == 2) {
				System.out.println("ha ganado el jugador 2");
			} else {
				System.out.println("ustedes han empatado");
			}
			break;
		default: 
			break;
		}
		
		}

}
