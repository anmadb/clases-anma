package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j10_ejerbucles3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector;
        InputStreamReader stream;
        
        stream = new InputStreamReader (System.in);
        lector = new BufferedReader (stream); 
        
        System.out.print("Ingrese la cantidad de líneas para la pirámide: ");
        int numLineas = Integer.parseInt(lector.readLine());
        
        for (int altura = 1; altura <= numLineas; altura++) {
    
            for (int espacio = 1; espacio <= numLineas - altura; espacio++) {
                System.out.print(" ");
            }
            for (int caracter = 1; caracter <= 2 * altura - 1; caracter++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
