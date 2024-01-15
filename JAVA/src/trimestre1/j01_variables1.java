package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j01_variables1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
        InputStreamReader stream;
        
        stream = new InputStreamReader (System.in);
        lector = new BufferedReader (stream);
	    
        int variable;
        int resultado;
        
        System.out.println("dame un numero");
        variable = Integer.parseInt(lector.readLine());

        resultado = variable+10;  
          if (variable > 15){
            System.out.println("el numero + 10 es mayor a 15 \nel numero es: "+resultado);
          }else{
            System.out.println("el numero + 10 es menor a 15 \nel numero es: "+resultado );
          } 

	}

}
