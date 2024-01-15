package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j08_ejerswitch4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader
		BufferedReader lector;
		InputStreamReader stream;
		
        stream = new InputStreamReader (System.in);
        lector = new BufferedReader (stream);
        
        //variables
        double valorA;
        double valorB;
        double valorC;
      
        
        //primer valor
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.println("Por favor, introduzca el valor de a: ");
        valorA = Double.parseDouble(lector.readLine());
        
        //segundo valor
        System.out.println("Ahora introduzca el valor de b: ");
        valorB = Double.parseDouble(lector.readLine());
        
        //ecuación
        valorC = -valorB/valorA;
        
        //resolución 
        if (valorA == 0) {
            System.out.println("Esa ecuación no tiene solución real.");
        }else{
            System.out.println("x= "+ valorC);
        }

	}

}
