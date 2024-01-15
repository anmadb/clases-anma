package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j10_ejerbucles1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector;
        InputStreamReader stream;
        
        stream = new InputStreamReader (System.in);
        lector = new BufferedReader (stream);
        
        int variable1 =0;
        int variable2 =0;
        int variable3 =0;
        int suma;
        
        do {
            System.out.println("Dame la variable inferior.");
            variable1 = Integer.parseInt(lector.readLine());
            
            System.out.println("Dame la variable mayor.");
            variable2 = Integer.parseInt(lector.readLine());
            
            if (variable1>=variable2) {
                System.out.println("Variables incorrectas.");  
            }else{
                
            }
        } while (variable1>=variable2); 
        
        do { 
            System.out.println("Dame un numero:");
            variable3 = Integer.parseInt(lector.readLine());
            
            if (variable3 == 0) {
                System.out.println("Fin del proceso.");
            }else if(variable3 == variable1 || variable3 == variable2) {
                System.out.println("El numero esta dentro del intervalo pero es igual a los limites.");
            }else {
               System.out.println("El numero esta dentro del intervalo."); 
            }
            
        } while (variable3>=variable1 && variable3<=variable2);
        
        
        suma = ((variable2 + variable1) * (variable2 + 1 - variable1)) / 2;
        System.out.println("La suma del intervalo es: "+ suma);
    

	}

}
