package test;
import java.util.*;

public class PiedraPapelTijera {

	public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("-------   TURNO DEL JUGADOR 1   -------");
       System.out.println("       [ PIEDRA, PAPEL, TIJERAS ]");
       System.out.print("          INGRESA TU OPCIÓN: ");
       String jugador1 = teclado.nextLine();
       
       while (jugador1.isEmpty() || jugador1 == "" || jugador1.toUpperCase().equals("PIEDRA") != true && jugador1.toUpperCase().equals("PAPEL") != true && jugador1.toUpperCase().equals("TIJERAS") != true) {
            System.out.print("POR FAVOR INGRESE PIEDRA, PAPEL O TIJERAS: ");
            jugador1 = teclado.nextLine();
       }
       
       System.out.println("-------   TURNO DEL JUGADOR 2   -------");
       System.out.println("       [ PIEDRA, PAPEL, TIJERAS ]");
       System.out.print("          INGRESA TU OPCIÓN: ");
       String jugador2 = teclado.nextLine();
       
       while (jugador2.isEmpty() || jugador2 == "" || jugador2.toUpperCase().equals("PIEDRA") != true && jugador2.toUpperCase().equals("PAPEL") != true && jugador2.toUpperCase().equals("TIJERAS") != true) {
           System.out.print("POR FAVOR INGRESE PIEDRA, PAPEL O TIJERAS: ");
           jugador2 = teclado.nextLine();
       }
       
       System.out.println("---------------------------------------");
       
       String[][] moves = {
    		   {"PIEDRA",   "PIEDRA",    "EMPATE"},
    		   {"PAPEL",    "PAPEL",     "EMPATE"},
    		   {"TIJERAS",  "TIJERAS",   "EMPATE"},
    		   {"PIEDRA",   "PAPEL",     "GANA JUGADOR 2"},
    		   {"PAPEL",    "TIJERAS",   "GANA JUGADOR 2"},
    		   {"TIJERAS",  "PIEDRA",    "GANA JUGADOR 2"},
    		   {"PIEDRA",   "TIJERAS",   "GANA JUGADOR 1"},
    		   {"PAPEL",    "PIEDRA",    "GANA JUGADOR 1"},
    		   {"TIJERAS",  "PAPEL",     "GANA JUGADOR 1"} 	                
       };

       for (int i = 0; i < moves.length; i++) {
		if( moves[i][0].toUpperCase().equals(jugador1.toUpperCase()) &&
    	    moves[i][1].toUpperCase().equals(jugador2.toUpperCase())) 
			System.out.println("        RESULTADO: "+moves[i][2]);
      	}
		System.out.println("---------------------------------------");
		
		System.out.println("¿DESEA JUGAR OTRA VEZ? INGRESE SI O NO");
		String respuesta = teclado.nextLine();
		
		while (respuesta.isEmpty() || respuesta == "" || respuesta.toUpperCase().equals("SI") != true && respuesta.toUpperCase().equals("NO") != true) {
			System.out.print("POR FAVOR INGRESE SI O NO:");
			respuesta = teclado.nextLine();
		}
		
		while (respuesta.toUpperCase().equals("SI")) {
			System.out.println("-------   TURNO DEL JUGADOR 1   -------");
		       System.out.println("       [ PIEDRA, PAPEL, TIJERA ]");
		       System.out.print("          INGRESA TU OPCIÓN: ");
		       jugador1 = teclado.nextLine();
		       
		       while (jugador1.isEmpty() || jugador1 == "" || jugador1.toUpperCase().equals("PIEDRA") != true && jugador1.toUpperCase().equals("PAPEL") != true && jugador1.toUpperCase().equals("TIJERAS") != true) {
		            System.out.print("POR FAVOR INGRESE PIEDRA, PAPEL O TIJERAS: ");
		            jugador1 = teclado.nextLine();
		       }
		       
		       System.out.println("-------   TURNO DEL JUGADOR 2   -------");
		       System.out.println("       [ PIEDRA, PAPEL, TIJERAS ]");
		       System.out.print("          INGRESA TU OPCIÓN: ");
		       jugador2 = teclado.nextLine();
		       
		       while (jugador2.isEmpty() || jugador2 == "" || jugador2.toUpperCase().equals("PIEDRA") != true && jugador2.toUpperCase().equals("PAPEL") != true && jugador2.toUpperCase().equals("TIJERAS") != true) {
		           System.out.print("POR FAVOR INGRESE PIEDRA, PAPEL O TIJERAS: ");
		           jugador2 = teclado.nextLine();
		       }
		       
		       System.out.println("---------------------------------------");

		       for (int i = 0; i < moves.length; i++) {
				if( moves[i][0].toUpperCase().equals(jugador1.toUpperCase()) &&
		    	    moves[i][1].toUpperCase().equals(jugador2.toUpperCase())) 
					System.out.println("        RESULTADO: "+moves[i][2]);
		      	}
				System.out.println("---------------------------------------");
				
				System.out.println("¿DESEA JUGAR OTRA VEZ? INGRESE SI O NO");
				respuesta = teclado.nextLine();
		}
		
		System.out.println("¡GRACIAS POR JUGAR!");
		
       teclado.close();
	}

}
