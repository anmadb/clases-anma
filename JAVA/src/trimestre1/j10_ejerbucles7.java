package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ejercicio 3

public class j10_ejerbucles7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
        InputStreamReader stream;
        
        stream = new InputStreamReader (System.in);
        lector = new BufferedReader (stream);
        
        int nav;
        
		do {
        	System.out.println();
        	System.out.println("| 1) Ver saldo | 2) Depositar dinero | 3) Retirar dinero | 4) Salir |");
        	nav = Integer.parseInt(lector.readLine());
			switch (nav) {
			case 1: System.out.println("15.334,33 EUROS");
			break;
			case 2: System.out.println("En estos momentos no puede depositar dinero. \nDisculpe las molestias.");
			break;
			case 3: System.out.println("En estos momentos no puede retirar dinero. \nDisculpe las molestias.");
			break;
			}
		} while (nav != 4);
		System.out.println();
		System.out.println("Gracias por su visita.");
	}

}
