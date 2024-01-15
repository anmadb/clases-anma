package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j04_nandnor {

	public static void main(String[] args) throws IOException {
		
		//Declaración de variable
        BufferedReader lector;
        InputStreamReader inputStream;
        String operacion;
        boolean operando1;
        boolean operando2;
        
        //Instanciación de objetos
        inputStream = new InputStreamReader(System.in);
        lector = new BufferedReader (inputStream);
        
        //Introducción de datos por parte del usuario 
        System.out.println("Que operación queres hacer, NAND o NOR??");
        operacion = lector.readLine();
        
        if (!operacion.equalsIgnoreCase("NAND") && !operacion.equalsIgnoreCase("NOR")){
            System.out.println("no es asi boludo");
        }else{
            System.out.println("Introduzca el primer operando: ");
            operando1 = Boolean.parseBoolean(lector.readLine());
            System.out.println("Introduzca el segundo operando: ");
            operando2 = Boolean.parseBoolean(lector.readLine());
            
            if (operacion.equalsIgnoreCase("NAND")){
            System.out.println("es: " +(!operando1&&operando2));
        }
        }

	}

}
