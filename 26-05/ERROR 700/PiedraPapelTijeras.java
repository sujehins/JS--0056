package cachipun.com;
import java.util.*;
import java.io.Console;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Console cons;
			
		if((cons = System.console())!= null) {
			
			System.out.println("USUARIO 1 seleccione:");
			System.out.println("(1) para PIEDRA");
			System.out.println("(2) para PAPEL");
			System.out.println("(3) para TIJERAS");
			
			char [] usuario1 = cons.readPassword();
			
			System.out.println(usuario1[0]);
			
			System.out.println("USUARIO 2 seleccione:");
			System.out.println("(1) para PIEDRA");
			System.out.println("(2) para PAPEL");
			System.out.println("(3) para TIJERAS");
			
			char [] usuario2 = cons.readPassword();
			
			if (usuario1 == usuario2) {
				System.out.println("Ambos ingresaron la misma opcion, Empate");
			} else if (usuario1[0] == 1 && usuario2[0] == 3 || usuario1[0] == 2 && usuario2[0] == 1 || usuario1[0] == 3 && usuario2[0] == 2 ) {
				System.out.println("jugador 1 le ha ganado al jugador 2");

			}else if (usuario2[0] == 1 && usuario1[0] == 3 || usuario2[0] == 2 && usuario1[0] == 1 || usuario2[0]== 3 && usuario1[0] == 2 ) {
				System.out.println("jugador 2 le ha ganado al jugador 2");
			}
			
		}
		
		

		scanner.close();
	}
}
