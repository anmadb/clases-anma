package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j10_ejerbucles2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector;
        InputStreamReader stream;
        
        stream = new InputStreamReader (System.in);
        lector = new BufferedReader (stream); 
        
        System.out.println("Hasta que numero primo queres que muestre.");
        
        int maximo = Integer.parseInt(lector.readLine());
        if (maximo >= 2) {
            System.out.print("2 ");
        }
        
        for (int iniciador = 3; iniciador <= maximo; iniciador++) {
            boolean Primo = true;
            for (int divisor = 2; divisor < iniciador; divisor++) {
            if (iniciador % divisor == 0) {
                Primo = false;
            }
        }
            if (Primo) {
                System.out.print(iniciador + " ");
                }
        }
	}

}
