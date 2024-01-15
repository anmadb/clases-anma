package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j10_ejerbucles5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector;
        InputStreamReader stream;
        
        stream = new InputStreamReader (System.in);
        lector = new BufferedReader (stream);
        
        System.out.print("Cuenta regresiva desde: ");
        int maximo = Integer.parseInt(lector.readLine());
        
        for (int fila = maximo; fila >= 0; fila--) {
            for (int contador = fila; contador >= 1; contador--) {
             System.out.print(" "+contador);   
            }
            System.out.println("\n");
        }

	}

}
